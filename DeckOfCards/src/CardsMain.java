import java.util.Scanner;

public class CardsMain extends  DeckOfCard {


    public static void main(String[] args)
    {
        System.out.println("Enter you choice: \n "+" 1, for displaying cards in a order \n"+
                " 2, for how many players want to play \n"+" " +
                "3, for displaying cards with suit and rank \n"+
                "4, for displaying all cards with suit and rank \n ");

        Scanner scanner = new Scanner(System.in);
        int optionSelected = scanner.nextInt();

        switch(optionSelected)
        {
            case 1:
                CardsMain obj = new CardsMain();
                System.out.println(obj.deckOfCard());
                break;

            case 2:
                Scanner scanner1 = new Scanner(System.in);
                int numberOfPlayers = scanner1.nextInt();

                for(int player=0; player<numberOfPlayers; player++)
                {
                    CardsMain players = new CardsMain();
                    System.out.println(players.shuffledDeck());
                }
                break;

            case 3:
                CardsMain obj1 = new CardsMain();
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Enter number from 0-51 for printing that card: ");
                int cardNumber = scanner2.nextInt();
                System.out.println(obj1.printSingleCard(cardNumber));
                break;

            case 4:
                System.out.println("Displaying all cards with suit and rank");
                CardsMain obj3 = new CardsMain();
                System.out.println(obj3.showCards());
                break;

            case 5:
            default:
                System.out.println("Enter a number from 1 to 4");
        }

    }
}
