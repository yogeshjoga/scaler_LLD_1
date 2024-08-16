package MockPrepLLD1.MultiThreadingRevison;

public class ThreadsCreation {


    // process vs Thread
    // multicore systems
    // context switching
    // coding a multi thread programmings
       // thread cration
        // start(), wait, sleep
        // thread pools
        // thread life cycle
        // Executors
        // Runnalbe and callable
        // futures
        // Volatile keyword


    /****
     * coding the multithreading
     *
     */


    // Thread cration
    public static void main(String[] args) {
        // Thread creation


    }


    /**
     * there are 5 ways to create threads
     *  1 Extending Thread class
     *  2 Implementing Runnable interface
     *  3 Using anonymous class
     *  4 Lambda expression
     *  5 Callable and Futures
     */
    class Print implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "  i am from implementing Runnable interface");
        }
    }

    class Myprint extends Thread{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " i am from Extending Thread class");
        }
    }



}
