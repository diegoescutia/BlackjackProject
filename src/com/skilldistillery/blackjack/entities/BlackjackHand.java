package com.skilldistillery.blackjack.entities;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
	}

	@Override
	public int getHandValue() {
		int handValue = 0;
		for (Card card : getHand()) {
			handValue = handValue + card.getValue();
		}

		return handValue;
	}

	public boolean isBlackjack() {
		if (getHandValue() == 21) {
			return true;
		} 
		else {
			return false;
		}
	}

	
	public boolean isBust() {
		if (getHandValue() > 21) {
			return true;
		} 
		else {
			return false;
		}
	}
	

	
	
}
