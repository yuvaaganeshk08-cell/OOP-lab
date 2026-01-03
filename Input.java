import java.util.Scanner;

public class Input {
    public static void main(String[] YG) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        System.out.print("Enter your height in meters:");
        double height = scanner.nextDouble();
        System.out.println("You are " + height + " meters tall.");

        System.out.print("Are you a pirate? (true/false): ");
        boolean pirate = scanner.nextBoolean();
        if (pirate) {
            System.out.println("You are a pirate");
        } else {
            System.out.println("You are not a pirate");
        }
        scanner.close();
    }
}
