package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BlackjackHand;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApp {

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.run();
	}

	public void run() {
		welcome();
		Scanner scan = new Scanner(System.in);
		blackJack(scan);
		scan.close();
	}

	private void blackJack(Scanner scan) {
	
		boolean game = true;
		while (game) {
		
			BlackjackHand blackjackhandDealer = new BlackjackHand();
			BlackjackHand blackjackhandPlayer = new BlackjackHand();
			Dealer dealer = new Dealer(blackjackhandDealer);
			Player player = new Player(blackjackhandPlayer);

			dealer.shuffle();
			suffleMessage();

			// Player's hand
			player.hit(dealer.dealCard());
			player.hit(dealer.dealCard());
			System.out.println("Players " + player.getHand() + " = " + player.getHand().getHandValue());
			System.out.println();
			// Dealer's hand
			dealer.hit(dealer.dealCard());
			System.out.println("Dealer " + dealer.getHand() + " + [*********] = " + dealer.getHand().getHandValue());
			dealer.hit(dealer.dealCard());

			if (blackjackhandPlayer.isBlackjack() && blackjackhandDealer.isBlackjack()) {
				System.out.println("Tie");
				game = false;
			} else if (blackjackhandPlayer.isBlackjack()) {
				System.out.println("Players " + player.getHand() + " = " + player.getHand().getHandValue());
				System.out.println("You win!");
				game= false;
			}
			while (blackjackhandPlayer.getHandValue() < 21) {
				System.out.println();
				System.out.println("Type the number:");
				System.out.println("  1. HIT");
				System.out.println("  2. STAND");
				int selection = scan.nextInt();

				if (selection == 1) {
					player.hit(dealer.dealCard());
					if (blackjackhandPlayer.isBust()) {
						System.out.println("Players " + player.getHand() + " = " + player.getHand().getHandValue());
						System.out.println("Bust");
						System.out.println("You lose!");
						game = false;
						break;
					} else if (blackjackhandPlayer.isBlackjack()) {
						System.out.println("Players " + player.getHand() + " = " + player.getHand().getHandValue());
						System.out.println("Blackjack!");
						System.out.println("You win!");
						game = false;
						break;
					}
					System.out.println("Players " + player.getHand() + " = " + player.getHand().getHandValue());
				} else if (selection == 2) {
					System.out.println("Dealer " + dealer.getHand() + dealer.getHand().getHandValue());
					while (dealer.willDealerHit(blackjackhandDealer)) {
						dealer.hit(dealer.dealCard());
						System.out.println("Dealer " + dealer.getHand() + dealer.getHand().getHandValue());
					}
					if (blackjackhandDealer.isBust()) {
						System.out.println("You win!");
						game = false;
						break;
					} else if (blackjackhandDealer.getHandValue() > blackjackhandPlayer.getHandValue()) {
						System.out.println("Dealer Wins");
						game = false;
						break;
					} else if (blackjackhandDealer.getHandValue() < blackjackhandPlayer.getHandValue()) {
						System.out.println("You win!");
						game = false;
						break;
					} else if (blackjackhandDealer.getHandValue() == blackjackhandPlayer.getHandValue()) {
						System.out.println("Its a tie");
						game= false;
						break;
					}
				}
			}
			if (game == false) {
				boolean bound = true;
				while(bound) {
				System.out.println();
				System.out.println("Do you want to play again?");
				System.out.println("Type the number");
				System.out.println("1. YES");
				System.out.println("2. NO");
				int choice = scan.nextInt();
				if(choice == 1) {
					game  = true;
					bound = false;
				}else if (choice == 2) {
					game = false;
					System.out.println("Thank you for playing");
					bound = false;
					
				}else if (choice > 2){
					System.out.println("Enter a valid number");
					bound = true;
					
				}
			}
			}	
		}
	}


	public void welcome() {
		System.out.println("****************************");
		System.out.println("***Welcome to the Casino****");
		System.out.println("****************************");
		System.out.println("**Lets Play Some BlackJack**");
		System.out.println("****************************");
	}

	public void suffleMessage() {
		System.out.println();
		System.out.println("----------------");
		System.out.println("|Shuffling deck|");
		System.out.println("----------------");
		System.out.println();
	}
}
