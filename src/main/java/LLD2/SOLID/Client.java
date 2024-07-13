package LLD2.SOLID;

public class Client {

    public static void main(String[] args) {

        Eagle e = new Eagle(new FlyHigh());
        e.fly();
    }
}
