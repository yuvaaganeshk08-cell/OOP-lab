import java.util.*;
public class Greeting{
    public static void main(String[] yg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Welcome "+ name);
        scanner.close();
    }
}