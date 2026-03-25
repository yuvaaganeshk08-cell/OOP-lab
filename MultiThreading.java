
public class MultiThreading {
    public static void main(String[] args){

        Thread thread1 = new Thread(new MYRunnable("Hello"));
        Thread thread2 = new Thread(new MYRunnable("Hi"));

        //The main thread will not wait to thread to finish

        System.out.println("Greeting starts");
        thread1.start();
        thread2.start();
        try{
        thread1.join();// Joins thread with main thread
        thread2.join();
        }

        catch(InterruptedException e){
            System.out.println("Something Went Wrong");
        }

    }
    
}

class MYRunnable implements Runnable{

    private final String text;
    MYRunnable(String text){
        this.text = text;
    }

    @Override

    public void run(){
        for(int i = 1; i <=5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(text);
                
            }
            catch(InterruptedException e){
                System.out.println("Something Went Wrong");
            }
        }
        System.out.println("Greeting Ends");
    }

}
