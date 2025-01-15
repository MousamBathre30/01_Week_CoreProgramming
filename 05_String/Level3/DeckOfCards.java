import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {

    // Method to initialize the deck
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards % numPlayers != 0) {
            throw new IllegalArgumentException("Cards cannot be evenly distributed among players.");
        }

        int cardsPerPlayer = numCards / numPlayers;
        String[][] players = new String[numPlayers][cardsPerPlayer];
        int deckIndex = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[deckIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
        }
    }

    public static void main(String[] args) {
        // Initialize the deck
        String[] deck = initializeDeck();
        System.out.println("Deck initialized.");

        // Shuffle the deck
        shuffleDeck(deck);
        System.out.println("Deck shuffled.");

        // Number of cards to distribute and number of players
        int numCards = 52; // You can modify this value
        int numPlayers = 4; // You can modify this value

        // Distribute the cards
        try {
            String[][] players = distributeCards(deck, numCards, numPlayers);

            // Print the players and their cards
            printPlayers(players);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
