import java.util.*;

public class Timertask {
    public static void main(String[] args){

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int count  = 3;
            @Override
            public void run(){
                System.out.println("Hello Makkale");
                count--;
                if(count<=0){
                    System.out.println("Task Completed");
                    timer.cancel();
                }
            
            }
        };

        timer.schedule(task,0,1000);//After 3000ms delay repeat the code(task) over a period of 10ms



    }
    
}
