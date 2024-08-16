package MockPrepLLD1;

public class PassREFandVal {

    int value =10;

    PassREFandVal(){}

    public void passVal(int value){
        value +=10;
    }

    public void passRef(PassREFandVal ob){
        ob.value +=10;
    }


    public static void main(String[] args) {
        PassREFandVal obj = new PassREFandVal();

        // pass by value
        obj.passVal(obj.value);
        System.out.println(obj.value);

        // calling ref
        obj.passRef(obj);
        System.out.println(obj.value);
    }
}
