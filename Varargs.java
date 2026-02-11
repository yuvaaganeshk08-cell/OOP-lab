public class Varargs{
    public static void main(String[] args){

        System.out.println(avg(4567,3456,76543,321));

        
    }
    static double avg(double...numbers){

            double sum = 0;
            if(numbers.length==0){
                return 0;
            }

            else{
            for(double number:numbers){
                sum+=number;
            }
            return sum/numbers.length;
        }
        }

}
