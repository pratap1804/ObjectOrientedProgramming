import java.util.Scanner;

public class DeckOfCard{

    public int[] deckOfCard(){
        final int deckSize =52;
        int[] deck = new int[deckSize];
        for(int i : deck){
            deck[i] = i;
        }
        return deck;
    }

    public int numberOfPlayers()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of played? ");
        int numOfPlayers = scanner.nextInt();
        return numOfPlayers;
    }

    public String printSingleCard(int num)
    {
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace"};
        return ranks[num % 13] +" of "+ suits[num / 13];
    }



    public boolean showCards()
    {
    for(int i=0; i< 52; i++)
        {
      System.out.print(printSingleCard(i));
        }
        System.out.println();
        return false;
    }


    public void shuffleCards(int[] array)
    {
        int count =0;
        for(int i=0; i<array.length; i++){
            int index= (int)Math.random()* (array.length-count);
            int temp = array[36-count];
            array[36-count] = array[index];
            array[index]=temp;
            count+=1;
        }
    }

    public int[] shuffledDeck(){
        int[] deck = deckOfCard();
        shuffleCards(deck);
        return deck;
    }

}
