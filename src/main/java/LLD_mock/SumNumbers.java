package LLD_mock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumNumbers {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int numThreads = 10; // Number of threads
        int range = (end - start + 1) / numThreads;

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        List<Future<Integer>> futures = new ArrayList<>();

        // Submit tasks to executor
        for (int i = 0; i < numThreads; i++) {
            int rangeStart = start + i * range;
            int rangeEnd = (i == numThreads - 1) ? end : rangeStart + range - 1;
            futures.add(executor.submit(new SumTask(rangeStart, rangeEnd)));
        }

        // Collect results
        int totalSum = 0;
        for (Future<Integer> future : futures) {
            try {
                totalSum += future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown executor
        executor.shutdown();

        // Print the final sum
        System.out.println("Total sum from 1 to 100 is: " + totalSum);
    }
}

class SumTask implements Callable<Integer> {
    private final int start;
    private final int end;

    public SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
