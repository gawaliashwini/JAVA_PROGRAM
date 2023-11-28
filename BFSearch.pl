initial_state(InitialState),best_first_search(InitialState,SolutionPath).
% Define the initial state
initial_state(state(1, 1)).

% Define the goal state
goal_state(state(3, 3)).

% Define valid moves
valid_move(state(X, Y), state(NewX, NewY)) :-
    (NewX is X + 1; NewX is X - 1),
    (NewY is Y + 1; NewY is Y - 1),
    NewX >= 1, NewX =< 3,
    NewY >= 1, NewY =< 3.

% Define heuristic function (Euclidean distance to the goal)
heuristic(state(X, Y), H) :-
    goal_state(state(GX, GY)),
    H is sqrt((X - GX)^2 + (Y - GY)^2).

% Best-First Search algorithm
best_first_search(State, Path) :-
    best_first_search([node(State, [])], [], Path).

best_first_search([node(State, Path) | _], _, Path) :-
    goal_state(State).

best_first_search([node(State, Path) | Rest], Visited, SolutionPath) :-
    findall(NewNode, (valid_move(State, NewState), \+ member(NewState, Visited),
                      heuristic(NewState, H), NewPath = [State | Path],
                      NewNode = node(NewState, NewPath, H)),
            Children),
    append(Children, Rest, UpdatedOpenList),
    sort_open_list(UpdatedOpenList, SortedOpenList),
    best_first_search(SortedOpenList, [State | Visited], SolutionPath).

% Sort the open list based on heuristic values
sort_open_list(List, SortedList) :-
    predsort(compare_nodes, List, SortedList).

% Compare nodes based on heuristic values
compare_nodes(Order, node(_, _, H1), node(_, _, H2)) :-
    compare(Order, H1, H2).
