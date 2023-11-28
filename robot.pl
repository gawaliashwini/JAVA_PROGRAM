 means_end_analysis(goal(at(robot,3,3))).
% Facts about the initial state and goal state
at(robot, 1, 1).
goal(at(robot, 3, 3)).

% Actions that the robot can perform
move(robot, X, Y) :-
    at(robot, X0, Y0),
    % Define valid moves (up, down, left, right)
    (X is X0 + 1; X is X0 - 1; Y is Y0 + 1; Y is Y0 - 1),
    valid(X, Y), % Check if the move is within the grid,
    retract(at(robot, X0, Y0)),
    assert(at(robot, X, Y)).

valid(X, Y) :-
    % Define the boundaries of the grid (e.g., a 3x3 grid)
    X >= 1, X =< 3, Y >= 1, Y =< 3.

% Means-End Analysis
means_end_analysis(Goal) :-
    Goal, !. % Base case: goal is already satisfied
means_end_analysis(Goal) :-
    difference(Goal, Current),
    choose_action(Current, Action),
    do(Action),
    means_end_analysis(Goal).

difference(Goal, Current) :-
    findall(P, (Goal, not(P)), Current).

choose_action(Current, Action) :-
    findall(A, (can(A), applies(A, Current)), Actions),
    choose_best(Actions, Action).

choose_best([A], A).
choose_best([A|Rest], Best) :-
    choose_best(Rest, B),
    evaluate(A, V1),
    evaluate(B, V2),
    best(A, V1, B, V2, Best).

evaluate(Action, Value) :-
    difference(Goal, Current),
    does(Action, Current),
    difference(Goal, NewCurrent),
    subtract_sets(Current, NewCurrent, Removed),
    length(Removed, Value).

subtract_sets([], _, []).
subtract_sets([X|Xs], Ys, Result) :-
    member(X, Ys),
    subtract_sets(Xs, Ys, Result).
subtract_sets([X|Xs], Ys, [X|Result]) :-
    subtract_sets(Xs, Ys, Result).

% Robot can move if it's not at the goal yet
can(move(robot, _, _)) :- not(goal(at(robot, _, _))).

% Apply an action to the current state
applies(Action, Current) :- does(Action, NewCurrent),
    subtract_sets(Current, NewCurrent, Removed),
    length(Removed, 1). % Only one item changes in the state.

% Define actions performed by the robot
does(Action, NewCurrent) :-
    copy_term(Action, Action),
    findall(P, (at(P, X, Y), not(P, X, Y)), NewCurrent).

% Main query to find a sequence of actions to reach the goal
?- means_end_analysis(goal(at(robot, 3, 3))).