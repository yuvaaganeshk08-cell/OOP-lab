import java.util.*;
public class Mathlib {
    public static void main(String[] yg){

        Scanner scanner = new Scanner(System.in);
        String place_1,noun_1;

        System.out.println("Welcome to Mathlib game!!!");
        System.out.println("Create your own Story");
        System.out.println("***************************");

        System.out.print("Enter a place: ");
        place_1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun_1 = scanner.nextLine();
	System.out.println("");
	System.out.println("");
	System.out.println("***Here, goes yoour story***");
        System.out.println("Today I went to "+ place_1);
        System.out.println("and I saw a "+ noun_1);
        System.out.println("I ate it");

        scanner.close();

    }
}
