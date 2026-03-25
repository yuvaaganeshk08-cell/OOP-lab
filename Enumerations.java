import java.util.Scanner;


public class Enumerations {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day:");
        String input = sc.nextLine().toUpperCase();
        
        try{
        Day d = Day.valueOf(input);

       /*  Day d = Day.MONDAY;

        System.out.println(d);
        System.out.println(d.getdayNum()); // output: 2
        */

        switch(d){ //Enhance Switch
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY  -> System.out.println("It is a weekday");
            case SATURDAY -> System.out.println("It is a weekend");
            case SUNDAY -> System.out.println("It is a weekend");
        }
    }

    catch(IllegalArgumentException e){
        System.out.println("Invalid Input");
    }

    }
}

enum Day{
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4),
    THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int dayNum;

    Day(int dayNum){
        this.dayNum = dayNum;
    }

    public int getdayNum(){
        return this.dayNum;
    }
}