import java.util.Scanner;
import java.util.Random;

// difine variables
public class Snakes {

    static void RollDice(){
        Random randValue = new Random();

        // int dice = randValue.nextInt(6) + 1; // roll a die from 1 to 6
        int boardPosition = 0;
        // int[] snakes = {12, 28, 45, 60, 74};
        // int[] ladders = {8, 22 , 50, 77};
        //                12, 10, 12, 16     

        System.out.println("your position on the board" + boardPosition);

        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the text based snakes and ladders, built with java.\n");

        while (boardPosition < 100) {
            // int[] snakes = {12, 28, 45, 60, 74, 97};
            // snakes
            if (boardPosition == 8) {
                boardPosition += 12;
                System.out.println("you have reached a ladder, your position now is: " + boardPosition); 
            } if (boardPosition == 22) {
                boardPosition += 10;
                System.out.println("you have reached a ladder, your position now is: " + boardPosition); 
            } if (boardPosition == 50) {
                boardPosition += 12;
                System.out.println("you have reached a ladder, your position now is: " + boardPosition); 
            } if (boardPosition == 77) {
                boardPosition += 16;
                System.out.println("you have reached a ladder, your position now is: " + boardPosition); 
            }

            //snakes
            if (boardPosition == 12) {
                boardPosition -= 9;
                System.out.println("!!! you have been eaten by a snake,\n Your board position now is:"+boardPosition);
            } if (boardPosition == 28) {
                boardPosition -= 18;
                System.out.println("!!! you have been eaten by a snake,\n Your board position now is:"+boardPosition);
            } if (boardPosition == 45) {
                boardPosition -= 10;
                System.out.println("!!! you have been eaten by a snake,\n Your board position now is:"+boardPosition);
            } if (boardPosition == 60) {
                boardPosition -= 20;
                System.out.println("!!! you have been eaten by a snake,\n Your board position now is:"+boardPosition);
            } if (boardPosition == 74) {
                boardPosition -= 60;
                System.out.println("!!! you have been eaten by a snake,\n Your board position now is:"+boardPosition);
            } if (boardPosition == 97) {
                boardPosition -= 20;
                System.out.println("!!! you have been eaten by a snake,\n Your board position now is:"+boardPosition);
            }
            System.out.println("board position:  " + boardPosition);
            System.out.println("press enter to roll the dice");
            scanner.nextLine();
            int dice = randValue.nextInt(6) + 1;
            System.out.println("dice rolled: " + dice);  
            boardPosition  += dice;    
        }
    }
    public static void main(String[] args) {
        RollDice();
    }
}