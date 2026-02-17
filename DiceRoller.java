import java.util.*;
public class DiceRoller{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfrolls;
        int total = 0;

        System.out.print("Enter the number of times you want to roll the dice: ");
        numOfrolls = scanner.nextInt();

        if(numOfrolls >0){

            for(int i =0;i<numOfrolls;i++){
                int roll = random.nextInt(6) + 1;
                System.out.println("You rolled :"+roll);
                total += roll;
                

            }
            System.out.println("Total: "+total);
            
        }
        else{
            System.out.println("Invalid inpput");
        }
    }
}