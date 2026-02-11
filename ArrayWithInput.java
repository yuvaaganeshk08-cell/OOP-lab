import java.util.Scanner;
public class ArrayWithInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many drinks:");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()
        String[]  drinks = new String[size];

        for(int i=0; i<drinks.length; i++){
            System.out.print("Enter a drink:");
            drinks[i] = sc.nextLine();
        }

        System.out.println("Your drinks are:");

        for(String drink:drinks){
            System.out.print(drink + ",");
        }
        sc.close();
    }
}