import java.util.*;
public class Encrpt{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to encrpt or decrpt: ");

        String x = scanner.nextLine();

        x = x.toLowerCase();
    if(x.equals("encrpt")){
        System.out.print("Enter Your Grade: ");
        int grade = scanner.nextInt();
        int en_grade = grade+8;
        System.out.println("Yor encrpted grade is "+ en_grade);
    }
        else if(x.equals("decrpt")){
            System.out.print("Enter Your Grade: ");
            int grade = scanner.nextInt();
            int de_grade = grade-8;
            System.out.println("Yor decrpted grade is "+ de_grade);
        }
        else{
            System.out.println("Invalid option. Please enter 'encrpt' or 'decrpt'.");
        }
        scanner.close();
    }
}