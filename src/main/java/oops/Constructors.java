package oops;

public class Constructors extends  Con4 {

    private int val;
    private  int num;
    private  int num1;
    static int hello;

    Constructors(){}

    Constructors(int val, int num, int num1) {
        super(num, num1);
        this.val = val;
        this.num = num;
        this.num1 = num1;
    //    this.hello = 10;
    }

    public int getVal() {
        super.val =10;
        return 0;
    }

    public static int hello(int val, int num){
        val += 10;
        num += 10;
        return 0;
    }






    public static void main(String[] args) {
      //  Constructors c = new Constructors(1,2,3);
        System.out.println("hello");
        System.out.println();


        int h = 10;
        int z = 20;
        hello(h,z);

        /**
         * java always call by value only
         *
         */

        System.out.println(h +" "+z);
    }


}
