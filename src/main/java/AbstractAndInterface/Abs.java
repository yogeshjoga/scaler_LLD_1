package AbstractAndInterface;

public class Abs {

    double dNum;
    int num;

    public static < I extends Number, D extends Number> double add(I i , D d){
        return i.intValue() + d.doubleValue();
    }


 

    public static void main(String[] args) {
      double res =  add(10,3.90);
        System.out.println(res);
    }

}
