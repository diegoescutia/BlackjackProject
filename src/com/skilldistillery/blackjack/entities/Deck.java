package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

private List<Card> deck = new ArrayList<>();


	// a deck is composed of 52 cards
	// for each of the 4 suits, create a card with different ranks for a total of 52 cards


public Deck() {
	Suit[] suits = Suit.values();
	Rank[] ranks = Rank.values();
	
	for (Suit suit : suits) {
		for(Rank rank : ranks) {
			Card card = new Card( suit, rank);
			deck.add(card);
		}
	}
}

public int checkDeckSize(){
	return deck.size();
}

public Card dealCard() {
	Card card = deck.remove(0);
	return card;
}

public void shuffle() {
	Collections.shuffle(deck);
}

}
