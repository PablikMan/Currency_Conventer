import java.util.Scanner;

public class Main {

    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        //1. Welcome screen
        firstMessage();
        int choice = userInput.nextByte();

        //2. Choice screen
        secondMessage();
        double chosenAmount = userInput.nextDouble();
        choices(choice, chosenAmount);

        //3. Result Screen
        thirdMessage();
        String startOver = userInput.next();

        endOfProgram(startOver);

        repeatOfProgram(startOver);

    }

    private static void repeatOfProgram(String startOver) {
        while (startOver.equalsIgnoreCase("Y")){
            System.out.println("Please choose an option (1/2):\n1. Dollars to Shekels\n2. Shekels to Dollars");
            int choice2 = userInput.nextByte();
            secondMessage();
            double chosenAmount2 = userInput.nextDouble();
            choices(choice2, chosenAmount2);
            thirdMessage();
            String startOver2 = userInput.next();
            if (startOver2.equalsIgnoreCase("N")){
                System.out.println("Thanks for using our currency converter");
                break;
            }
        }
    }

    private static void endOfProgram(String startOver) {
        if (startOver.equalsIgnoreCase("N")){
            System.out.println("Thanks for using our currency converter");
        }
    }

    private static void thirdMessage() {
        System.out.println("Would you like to start over?");
        System.out.println("Please select Y/N: ");
    }

    private static void secondMessage() {
        System.out.println("Please enter an amount to convert:");
    }

    private static void firstMessage() {
        System.out.println("Welcome to currency converter");
        System.out.println("Please choose an option (1/2):\n1. Dollars to Shekels\n2. Shekels to Dollars");
    }

    private static void choices(int choice, double amount) {
        if (choice == 1){
            CoinFactory dollarToShekel = new CoinFactory();
            Coin ilsValue = dollarToShekel.getCoinInstance(Coins.USD);
            double result = ilsValue.calculate(amount);
            System.out.println(result);
        }else if (choice == 2){
            CoinFactory shekelToDollar = new CoinFactory();
            Coin dollarValue = shekelToDollar.getCoinInstance(Coins.ILS);
            double result = dollarValue.calculate(amount);
            System.out.println(result);
        }
    }



}
