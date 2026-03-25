import java.util.*;

public class Threading {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        MyRunnable myrunnable = new MyRunnable();

        Thread thread = new Thread(myrunnable);
        thread.setDaemon(true);//Process goes on until MAIN THREAD completes
        thread.start();

        //----------MAIN THREAD-----------//
        System.out.println("You have five seconds to answer the question!");
       
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(name);


        sc.close();
    }
    
}

class MyRunnable implements Runnable{

    @Override
    public void run(){
         for(int i = 1; i<= 5; i++){
            
            try{
                Thread.sleep(1000);
                
            }
            catch(InterruptedException e){
                System.out.println("Interrupted");
            }

            if(i == 5){
                System.out.println("TIME'S UP");
                System.exit(0);// Ends code
            }
        }

    }

}
