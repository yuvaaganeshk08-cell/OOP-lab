import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        try{

        //System.out.println(1/0);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Your number is "+number);

        }
        catch(ArithmeticException e){//e is name of exception, you can give any name

            System.out.println("You Can't divide by zero");
        }

        catch(InputMismatchException me){
            System.out.println("Invalid Input");
        }

        catch(Exception e){ //For all Exception
            System.out.println("Something Went Wrong");
        }

        finally{//This is optional. This block will execute even if error occurs
            scanner.close();
        }

        

    }

}
