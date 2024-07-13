package oops;

public class User extends Student{

    int value;
    double amount;

    User(){

    }
    User(int value, double amount, int age, String name){
        this.value = value;
        this.amount = amount;
        super.age = age;
        super.name = name;
    }


    public static void main(String[] args) {
        User user = new User();
        user.age = 10;
        user.name = "hello";
        String str = user.name;
        System.out.println(str);
    }

}
