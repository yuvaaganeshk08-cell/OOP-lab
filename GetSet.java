public class GetSet {
    public static void main(String[] args){

      Car car = new Car("BMW", "Black", 1000000);
      car.setColor("Red"); //setter used
      System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice()); //getter used
    }
}

class Car{
   private String model;
   private String color;
    private int price;


    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }
    //getter(making readable)
    String getModel(){
        return model;
    }
    String getColor(){
        return color;
    }
    int getPrice(){
        return price;
    }

    //setter (making writable)
    void setModel(String model){
        this.model = model;}
    void setColor(String color){
        this.color = color;}
    void setPrice(int price){
        this.price = price;

    }    
}

