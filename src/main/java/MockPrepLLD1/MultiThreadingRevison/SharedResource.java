package MockPrepLLD1.MultiThreadingRevison;

class SharedResource {
    private boolean available = true;

    public synchronized void produce() throws InterruptedException {
        while (available) {
            wait();
        }
        // Produce item
        available = true;
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait();
        }
        // Consume item
        available = false;
        notify();
    }
}

 class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                while (true) {
                    resource.produce();
                    Thread.sleep(1000); // Simulate time taken to produce
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    resource.consume();
                    Thread.sleep(1000); // Simulate time taken to consume
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}