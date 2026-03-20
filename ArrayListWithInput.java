import java.util.*;

public class ArrayListWithInput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i =1; i <= numOfFood; i++){
            System.out.print("Enter food "+i+": ");
            String food = scanner.nextLine();
            list.add(food);
        }

        System.out.println(list);

        scanner.close();
    }
    
}
