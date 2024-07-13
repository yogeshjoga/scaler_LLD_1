package oops;

public class Con1 {

    private int x;
    private int y;

    public  Con1(){}

    public Con1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Con1(Con1 con) {
        this.x = con.x;
        this.y = con.y;
    }

    static int xxx =10;

    public static void main(String[] args) {
        Con1 con1 = new Con1(3,4);
        Con1 duplicate = new Con1(con1);

        System.out.println(con1.x+" "+con1.y);
        System.out.println(duplicate.x+" "+duplicate.y);



        Con1 d = new Con1();
        int y =d.x;
        System.out.println(d.xxx);

    }
}
