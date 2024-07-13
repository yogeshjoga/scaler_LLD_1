package mutltithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {


    static NumberPrinter num;



    public static void main(String[] args) {


      // newThreads();


        // Thread Pool
        newThreads(1000000000000000L);


    }


    public static void newThreads(){
        for(int i=1; i<=1000000; i++){
            num = new NumberPrinter(i);
            Thread t = new Thread(num);
            t.start();
        }
    }
    public static void newThreads(long range){
        ExecutorService   ex = Executors.newFixedThreadPool(10);
        for(int i=1; i<=range; i++){
          //  ExecutorService   ex = Executors.newFixedThreadPool(10);
            num = new NumberPrinter(i);
            ex.execute(num);
        }
    }

}
