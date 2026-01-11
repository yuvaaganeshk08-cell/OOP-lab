import java.util.Scanner;
public class Isint {
// Consider renaming 'yg' to a more descriptive name like 'args' for better readability
// Consider renaming 'yg' to a more descriptive name like 'args' for better readability
    public static void main(String[] args){
// It's a good practice to close the Scanner object using scanner.close() to avoid resource leaks
        Scanner scanner = new Scanner(System.in);
// It's a good practice to close the Scanner object using scanner.close() to avoid resource leaks

        System.out.print("Enter an integer: ");
        if(scanner.hasNextInt()){
            int num = scanner.nextInt();
            System.out.println("The entered input is an integer: " + num);
        } else {
            System.out.println("The entered input is not an integer.");
        }
        scanner.close();
    }
    
}
