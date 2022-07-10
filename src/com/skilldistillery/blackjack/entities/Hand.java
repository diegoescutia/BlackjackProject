package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	private List<Card> hand = new ArrayList<>();
	

	public abstract int getHandValue();
	
	public Hand () {}
	
	public void addCard(Card card) {
		this.hand.add(card);
	}
	
	public void clear() {
		hand.clear();
	}
	
	public List<Card> getHand() {
		return hand;
	}

	@Override
	public String toString() {
		return "Hand:" + hand ;
	}
	
	
}
