package mutltithreading;

public class NumberPrinter implements  Runnable{
    int number;

    // constructor
    NumberPrinter(int number){
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(this.number +" "+ Thread.currentThread().getName());
    }
}
