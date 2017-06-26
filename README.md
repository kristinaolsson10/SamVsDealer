# SamVsDealer

Can you beat the dealer at 21?

Model the game
	•	create a single deck of playing cards
	•	two players (called Sam and the Dealer) who will play against each other
	•	each player is given two cards from the top of a shuffled deck of cards

Rules to implement
	•	determine score of a hand[1]
	•	check if either player has blackjack (21) with their initial hand and wins the game
	•	if neither player has blackjack then Sam can start drawing cards from the top of the deck
	•	Sam should stop drawing cards from the deck if their total reaches 17 or higher
	•	Sam has lost the game if their total is higher than 21
	•	when Sam has stopped drawing cards the Dealer can start drawing cards from the top of the deck
	•	the Dealer should stop drawing cards when their total is higher than Sam.
	•	the Dealer has lost the game if their total is higher than 21
	•	determine which player wins the game
	•	Sam wins when both players starts with 21
	•	Dealer wins when both players starts with 22
[1] Numbered cards are their point value. Jack, Queen and King count as 10 and Ace counts as 11.

Input
The game should be able to read a file containing a deck of cards, taking the reference to the files as a command line argument, as a starting point. If no file is provided, a new shuffled deck should be initialized.
The list is in the following format:
CA, D4, H7, SJ,…, S5, S9, D10

Suits:
C: Clubs
D: Diamonds
H: Hearts
S: Spades

Values:
2: 2
3: 3
….
10: 10
J: Jack
Q: Queen
K: King
A: Ace

Output
At the end, the solution should print the name of the winner to standard out, together with the hands of both the dealer and Sam. Using the following format:
[sam|dealer]
sam: card1, card2,..., cardN
dealer: card1, card2,..., cardN

Example
When supplied with the following cardlist:
CA, D5, H9, HQ, S8,
The output should look like:
sam
sam: CA, H9
dealer: D5, HQ, S8

Testing
The solution should include tests.
