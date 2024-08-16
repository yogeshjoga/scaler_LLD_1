package AbstractAndInterface;

public class Client extends Abs implements Inter {

    private Abs obj = new Abs();


    @Override
    public void print() {
        System.out.println(obj.dNum+ " "+ obj.num);
    }

    @Override
    public int add(double a, int b) {
        return (int)a+b;
    }

    @Override
    public int sub(int a, double b) {
        return a- (int)b;
    }


    public static void main(String[] args) {
        Client c = new Client();

        c.print();
        c.sub(1, 2);
    }
}
