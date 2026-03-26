
public class Cal{
    public static void main(String[] args){
        
        Add x = new Add();
        System.out.println(x.add(5,5));
        System.out.println(x.add(7,4,2));   
        System.out.println(x.GetAdd(5.6,3.4));

    }
}


class Add{
    
    public int add(int a,int b){
        return a+b;
    }
    
    protected int add(int a,int b,int c){
        return a+b+c;
    }
    
    private double add( double a, double b){
        return a+b;
    }
    public double GetAdd(double a, double b){
        return add(a,b);
    }
    
}