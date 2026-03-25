import java.util.ArrayList;


public class Generics {
    public static void main(String[] args){

        //Generics allow classes, interfaces, and methods to work with different data types while ensuring type safety.


        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        Box<String> box = new Box<>();

        box.setItem("banana");
        System.out.println(box.getItem());

    }
    
}


class Box<T>{
    T item;  //WE don't know the data type
    public void setItem(T item){
        this.item = item;

    }
    public T getItem(){
        return this.item;
    }


}
