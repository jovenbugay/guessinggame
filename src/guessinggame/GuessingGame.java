
package guessinggame;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static final Random RANDOM = new Random();
    public static final int MAX_NUMBER = 100;
    
    public static void main(String[] args) {
        int numberToFind = RANDOM.nextInt(MAX_NUMBER) +1;
        Scanner userInput = new Scanner(System.in);
        int numberTries = 0, userGuess = 0;
        String answer = null;
        
        while (userGuess != numberToFind){
            System.out.println("Guess a number between 1 and " + MAX_NUMBER + ":");
            userGuess = userInput.nextInt();
            numberTries++;
            
            if (userGuess < 1 || userGuess > MAX_NUMBER){
                System.out.println("Please enter a number only between 1 and " + MAX_NUMBER);
            }
            else if (userGuess > numberToFind){
                System.out.println("You are too high!!");
            }
            else if (userGuess < numberToFind){
                System.out.println("You are too low!");
            }    
            else if (userGuess == numberToFind){
                System.out.println("Great, you got the number " + numberToFind + " in " + numberTries + " tries");
                    
                    }       
                    }    
            }   
        }
         
    

    

