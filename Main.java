public class Main

{

    public static void main(String[] args)
    {
        driver();
    }
    public static void driver()
    {
        String[] dmgType = {"fire", "ice", "dark" , "light"};
        String[] creatures = {"Skin Walker" , "Krumpus" , "Bigfoot" , "Wendigo" , "Lochness Monster" , "Mothman"};
        Deck deck = new Deck(dmgType.length * creatures.length);
        for (int i = 0; i < creatures.length; i++)
        {
            for (int j = 0; j < dmgType.length ; j++)
            {
                Card card = new Card(creatures[i] , dmgType[j]);
                deck.add(card);
            }

        }
        System.out.println(deck.getCardsInDeck());


        deck.deal(creatures.length);
        System.out.println(deck.toString());
        Deck deck1 = new Deck(deck);
        System.out.println(deck1.toString());



    }
}
