import java.util.*;
public class RockPaperScissors{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String userChoice;
        String RandomChoice;
        boolean playAgain = true;
        long count = 0;
        long total = 0;

        System.out.println("*************************************");
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("*************************************");
        
        

        while(playAgain){
            boolean validInput = true;
            System.out.print("Your Choice:");
            userChoice = scanner.nextLine().toLowerCase();
        if(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")){
            RandomChoice = choices[random.nextInt(choices.length)];
            System.out.println("Computer's Choice: " + RandomChoice);

            if(userChoice.equals(RandomChoice)){
                System.out.println("TIE!");
            }

            else if((userChoice.equals("rock") && RandomChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && RandomChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && RandomChoice.equals("paper"))){

                    System.out.println("YOU WIN!");
                    count++;}
            
            else{
                System.out.println("YOU LOSE!");
            }
            total++;
        }
         else{
            System.out.println("Invalid input. Please enter Rock, Paper, Scissors.");
            continue;
        }
        
        while(validInput){
            System.out.print("Do you want to play again? (yes/no): ");
            String Continue = scanner.nextLine().toLowerCase();
            if(Continue.equals("yes")){
                playAgain = true;
                validInput = false;
            }
            else if(Continue.equals("no")){
                playAgain = false;
                System.out.println("Thanks for playing!");
                validInput = false;
                System.out.println("Your total games: " + total);
                System.out.println("Your total wins: " + count);
                
            }
            else{
                System.out.println("Invalid Input! Please enter yes or no.");
                validInput = true;
             }
        }
    }
    scanner.close();
}
}