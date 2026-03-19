public class Aggregation {
    public static void main(String[] args){
        Engine e1 = new Engine("V8", 450);
        Engine e2 = new Engine("V6", 300);
        Engine e3 = new Engine("Electric", 200);

        Engine[] engines = {e1,e2,e3};

       Manufacturer manufacturer = new Manufacturer("Tata", "India", engines);
       manufacturer.displayInfo();
    }
}

class Engine{
    String type;
    int horsepow;
    Engine(String type, int horsepow){
        this.type = type;
        this.horsepow = horsepow;
    }

    String displayInfo(){
        return "Engine Type: "+type+ "\nHorsepower: "+horsepow;
    }
}

class Manufacturer{
    String name;
    String country;
    Engine[] engines; //aggregation relationship (if manufacturer is deleted, engines can still exist but if engines are deleted, manufacturer can still exist)
    Manufacturer(String name, String country, Engine[] engines){
        this.name = name;
        this.country = country;
        this.engines = engines; 
    }

    void displayInfo(){
        System.out.println("Manufacturer: "+name+", Country: "+country);
        System.out.println("Engines:");
        for(Engine engine : engines){
            System.out.println(engine.displayInfo());
        }
    }
}