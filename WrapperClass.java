public class WrapperClass {

    public static void main(String[] args){

        //primitve data types
        int a = 10;
        char b = '@';
        boolean c = true;
        double d = 3.14;


        //wrapper classes
        Integer a1 = Integer.valueOf(a); //boxing
        Character b1 = Character.valueOf(b); //boxing
        Boolean c1 = Boolean.valueOf(c); //boxing
        Double d1 = Double.valueOf(d); //boxing



        //Auto-boxing (automatic conversion of primitive to wrapper class)
        Integer a2 = a; 
        Character b2 = b;
        Boolean c2 = c;
        Double d2 = d;

        //Unboxing (conversion of wrapper class to primitive)
        int a3 = a1.intValue();
        char b3 = b1.charValue();
        boolean c3 = c1.booleanValue();
        double d3 = d1.doubleValue();


        int  a4 = a2; //auto-unboxing
        char b4 = b2;
        boolean c4 = c2;
        double d4 = d2;
    }
    
}
