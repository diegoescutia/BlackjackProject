
# BlackjackProject

## Description 
Welcome to my Blackjack simulator. This program was developed in Java 1.8. I hope you enjoy the game. 

 - In order to start, the dealer will shuffle the card deck, then the dealer will issue two cards to the player. The dealer will issue two cards to himself, but one of the cards will be face down, effectively veiling his total card value. 
 - These are the card values in the game regardless of their suit:
	 -  2, 3, 4, 5, 6, 7, 8, 9, 10
	 - Jack, Queen, and King  hold a value of 10
	 -  Ace = 11
- If the total card value is 21, this is called "Blackjack" and the player wins the game.
	- This is as long as the dealers card value is not also 21. This will be tie and no one wins the game.
	
- The total card value cannot exceed 21, if it does it is called "Bust" and the player loses the game. 
	- the dealer can also bust.
	
- While the player has a card value less than 21, they have the option of "Hitting" meaning the dealer will be them an additional card. 
	- The player can hit as many times as they want as long as they do not bust.
- Once the player is satisfied with their card value, the player "stands".  Meaning, they will not get any additional cards and the dealer must expose his face-down card. 
	- When the dealer reveals their card value, if the value is less than 18, the dealer must hit.
		- Once the card value of the dealer is higher than 18,  the value of the dealer and the player gets compared. Whomever has the highest score wins. 
	- When the dealer is hitting it is possible for the dealer to bust or blackjack.
	- If when the player stands, the card value of the dealer is higher than 18, the dealer does not have to hit, and the value of the dealer and the player gets compared. Whomever has the highest score wins.  
	

	
## Technology Used 
Java, File I/O, Enums, Abstraction 

## Lesson Learned 
The creation of enums is a newly developed skill. This assignment helped to further cement object oriented programming. The interaction of abstract classes with non abstract classes was also further understood.    
