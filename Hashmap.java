import java.util.HashMap;


public class Hashmap {
    public static  void main(String[] args){

        //HashMap is a collection that stores data in key-value pairs and allows fast retrieval using keys.
        // HashMap in Java is similar to a dictionary in Python because both store data as key–value pairs.

        HashMap<String,Double> map = new HashMap<>();

        map.put("Tomato",18.50);
        map.put("Onion",120.00);
        map.put("Carrot",49.99);
        System.out.println(map); //{Carrot=49.99, Onion=120.0, Tomato=18.5}

        System.out.println(map.get("Tomato"));//18.5
        System.out.println(map.containsKey("Carrot"));//true

        System.out.println(map.containsValue(50.00));//false
        System.out.println(map.size()); //3

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }

    }
    
}
