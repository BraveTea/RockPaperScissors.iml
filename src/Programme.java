import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Programme {

    public static void main(String[] args) {
        System.out.println("config");
        
        for (int i = 0; i < 10; i++) {
            runGame();
        }

    }

    public static void runGame() {


        try {
            String[] choicesArr = {"Rock", "Paper", "Scissors"};

            Random rand = new Random();
            Scanner scan = new Scanner(System.in);


            int computerChoice = rand.nextInt(3);

            System.out.printf("Please choose 0: %s, 1: %s, or 2: %s%n", choicesArr[0], choicesArr[1], choicesArr[2]);
            int playerChoice = scan.nextInt();
            System.out.printf("You have chosen %s%nThe computer has chosen %s%n", choicesArr[playerChoice], choicesArr[computerChoice]);

            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if (playerChoice == 0 && computerChoice == 2) {
                System.out.println("You've won!");
            } else if (playerChoice > computerChoice) {
                System.out.println("You've won!");
            } else {
                System.out.println("The computer has won!");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("out of bounds");
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Please enter a number");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("test");
        }

    }



}
