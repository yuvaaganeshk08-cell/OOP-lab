public class CalNAdvCal{
    public static void main(String[] args){
        Calculator cal = new Calculator();
        AdvanceCalculator acal = new AdvanceCalculator();
        System.out.println(cal.add(67,69));
        System.out.println(cal.display());
        System.out.println(cal.accessPrivate());
        System.out.println(acal.add(67,69));
        System.out.println(acal.display());
        acal.show();
        
        
    }
}

class Calculator{
    
    
    public double add(double a, double b){
        return a+b;
    }
    protected String display(){
        return "This is a message";
    }
    
    private String show(){
        return "Nothing to show";
        
    }
    
    public String accessPrivate(){
        return show();
    }
}

class AdvanceCalculator extends Calculator{
    
    @Override
    public double add(double a, double b){
        return (a+b)/2;
    }
    
    @Override
    protected String display(){
        return "This is not a message";
    }
    
    public void show(){
        System.out.println("There is something to show");
    }
    
    
}