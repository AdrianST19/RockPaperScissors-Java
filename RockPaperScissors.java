import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {  
    
    Scanner input = new Scanner(System.in);
    
    do{ // the computer will execute the code at least once, until the player decides to exit
      String[] rps = {"r", "p", "s"};
      String computerMove = rps[new Random().nextInt(rps.length)];
      String playerMove;
      
      while(true){
        System.out.println("Please enter your move: \n'r' for rock\n'p' for paper\n's' for scisscors");
        // it breaks out of the while loop when the user chooses one of the moves that are above
        playerMove = input.nextLine();
        if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) break;
        // if the user chooses anything else, it will keep looping
        System.out.println(playerMove + " is not a valid move.");
      }
      
      // prints out the move that the computer made
      if(computerMove.equals("r")) System.out.println("Computer played -> rock");
      if(computerMove.equals("p")) System.out.println("Computer played -> paper");
      if(computerMove.equals("s")) System.out.println("Computer played -> scissors");
      
      // if the move of the player is the same to the one of the computer, it will be a tie
      if (playerMove.equals(computerMove)) {
        System.out.println("The game was a tie!");
      }
      else if (playerMove.equals("r")) { // if you choose rock 
        if (computerMove.equals("p")) { // and the computer chooses paper
          System.out.println("You lose!"); // then the computer will be the winner
          
        } else if (computerMove.equals("s")) { // if you choose scissors instead of rock
          System.out.println("You win!"); // then you win
        }
      }
      
      else if (playerMove.equals("p")) { // if you choose paper
        if (computerMove.equals("r")) { // and the computer chooses rock
          System.out.println("You win!"); // you are the winner
          
        } else if (computerMove.equals("s")) { // but if you choose scissors instead of paper
          System.out.println("You lose!"); // you will clearly lose
        }
      }
      
      else if (playerMove.equals("s")) { // if you choose scissors 
        if (computerMove.equals("p")) { // and the computer chooses paper
          System.out.println("You win!"); // then you win
          
        } else if (computerMove.equals("r")) { // if you choose rock instead of scissors, well...
          System.out.println("You lose!"); // then you lose
        }
      }
      
      System.out.println("Type 'e' to exit, if you want to play again type anything else!");
      String playAgain = input.nextLine();
      
      if (playAgain.equals("e")) {
        break; 
      }
    }while (true);
    input.close();
  }
}
