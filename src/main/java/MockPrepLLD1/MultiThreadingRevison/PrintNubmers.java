package MockPrepLLD1.MultiThreadingRevison;

public class PrintNubmers {

    public static void call(){

    }





    class Print implements Runnable {
        @Override
        public void run() {
            for(int i = 0; i < 10; i++) {
                call();
            }
        }
    }

}
