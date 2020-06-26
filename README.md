# StrategyCity

Dynamic programming to solve a strategy problem:

A new strategy video game has the player taking the role of the ruler of a weak state which
is under attack by a substantially stronger enemy. Initially the player controls all N cities of his
state. The state is long and thus the cities can be represented as N squares on a line as depicted
in Figure 1. At the end of each year the player receives from each city i he controls, pi gold coins
for taxes. The opponent eventually is going to conquer the whole state; thus, the objective for the
player is to maximize the amount of gold he collects before all the cities are overtaken.
At the beginning of every year the player decides to build a wall between two neighbor cities
he controls. Subsequently, the enemy observes the position of the wall and chooses to attack either
from east or west conquering all the cities before the wall. At the end of the year the player receives
taxes from the cities still under his control and the wall is destroyed. The same process is repeated
every year until the whole state is conquered.
The player should be particularly careful when choosing the location of the wall. It is known
that the enemy always decides to attack from the direction that minimizes the number of gold coins
the player can collect. That is, you may assume that the enemy minimizes the amount of coins the
player can receive (after she/he has chosen the location for the wall) in the current and all future
rounds.
