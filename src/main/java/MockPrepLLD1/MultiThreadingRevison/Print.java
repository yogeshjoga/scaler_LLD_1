package MockPrepLLD1.MultiThreadingRevison;

public class Print implements Runnable{

    private int start;
    private int end;

    public Print(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for(int i= start; i<= end; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int totalNumbers = 100;
        int totalThreads = 10;
        int threadNumber = totalNumbers/totalThreads;

        Thread[] threads = new Thread[threadNumber];
        for(int i=0; i<totalThreads; i++){
            int start = i * threadNumber +1;
            int end = (i +1) * threadNumber +1;
            threads[i] = new Thread(new Print(start,end));
        }

        for(Thread thread : threads){
            thread.start();
        }
    }
}
