import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(7);
        list.add(9);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");//Adds element at last
        fruits.add("orange");

        System.out.println(fruits);
        
        System.out.println(list);
        
        list.remove(2);// Remove element with specific element
        System.out.println(list);

        fruits.set(1,"banana");//Add element in given index
       
        System.out.println(list.get(1));//Access element of given index
       
        System.out.println(fruits.size());//Gives total elements present in list

        Collections.sort(list);//Sorts the list

        System.out.println(list);

        for(String fruit: fruits) System.out.println(fruit);//Itreates the list
        
    }
    
}
