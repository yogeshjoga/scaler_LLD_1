package Multithreading_complete;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Consumer{



    public static void main(String[] args) throws Exception {
        int THREAD_POOL_SIZE = 10;
        ExecutorService execService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            final int j = i;
            futures.add(execService.submit(() -> j));
        }

        int total = 0;
        for (Future<Integer> future : futures) {
            try {
                total += future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Total count: " + total);
        execService.shutdown();
    }
}