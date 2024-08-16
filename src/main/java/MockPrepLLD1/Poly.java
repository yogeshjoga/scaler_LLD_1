package MockPrepLLD1;

public class Poly {


    int hello;
    String name;
    boolean male;


    // Construrcor chaninging
    public Poly(int hello, String name, boolean male) {
        this.hello = hello;
        this.name = name;
        this.male = male;
    }

    public Poly(int hello, String name){
        this.hello = hello;
        this.name = name;
    }

    public Poly(int hello){
        this.hello = hello;
    }



    // polymorphism

    int num1;
    int num2;
    double num3;
    double num4;


    // compile time poly
    // overloading method overloading
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public double add(double num3, int num1){
        return num1 + num3;
    }



}
