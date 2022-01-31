import java.util.Arrays;

public class Deck
{
    private Card[] deckOfCards;
    private boolean[] hasBeenDealt;
    private int capacityOfDeck = 0;
    private int cardsInDeck = 0;


    public Deck()   //Constructor that defaults to 30 capacity
    {
        this.capacityOfDeck = 30;
        this.deckOfCards = new Card[this.capacityOfDeck];
        hasBeenDealt = new boolean[cardsInDeck];
    }
    public Deck(int capacityOfDeck) //Constructor that sets capacity to any number
    {
        this.capacityOfDeck = capacityOfDeck;
        this.deckOfCards = new Card[this.capacityOfDeck];
        hasBeenDealt = new boolean[this.capacityOfDeck];
    }
    public Deck(Deck deck)
    {
        deckOfCards = deck.getDeckOfCards();
        hasBeenDealt = new boolean[capacityOfDeck];
        hasBeenDealt = deck.getHasBeenDealt();
        capacityOfDeck = deck.getCapacityOfDeck();
        cardsInDeck = deck.getCardsInDeck();
    }
    
    public void add(Card card)
    {
        deckOfCards[cardsInDeck++] = card;
    }

    public Card deal(int index)
    {
        hasBeenDealt[index] = true;
        return deckOfCards[index];
    }

    public Card returnToDeck(int index)
    {
        hasBeenDealt[index] = false;
        return deckOfCards[index];
    }

    public String toString()
    {
        String helper = "";
        for (int i = 0; i < deckOfCards.length; i++)
        {
            helper  += (deckOfCards[i] +"" + hasBeenDealt[i]);
            helper+= "\n";
        }
        return helper;

    }

    public Card[] getDeckOfCards() 
    {
        return deckOfCards;
    }

    public boolean[] getHasBeenDealt()
    {
        return hasBeenDealt;
    }

    public int getCapacityOfDeck() 
    {
        return capacityOfDeck;
    }

    public int getCardsInDeck() 
    {
        return cardsInDeck;
    }
}
