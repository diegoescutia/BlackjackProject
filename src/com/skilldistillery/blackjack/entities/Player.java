package com.skilldistillery.blackjack.entities;

public class Player {

	private Hand hand = new BlackjackHand();
	
	
	public Player(Hand hand) {
		super();
		this.hand = hand;
	}
	
	
	public void hit(Card card) {
		hand.addCard(card);
	}
	
	public void stand() {
		
	}


	public Hand getHand() {
		return hand;
	}


	public void setHand(Hand hand) {
		this.hand = hand;
	}


	


	
	
	
}
