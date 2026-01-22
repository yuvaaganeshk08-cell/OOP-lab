import java.util.Scanner;
public class Isint {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

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

