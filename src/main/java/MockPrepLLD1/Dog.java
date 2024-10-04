package MockPrepLLD1;

public class Dog {

    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog addAge(Dog dog){
        dog.age = age + 10;
        return dog;
    }

    public static void updateAge( int age){
        age = age + 10;
    }


    public static void main(String[] args) {
        Dog dog = new Dog("Dog", 20);
        dog.addAge(dog);
        System.out.println(dog.age);

        int number = 20;
        updateAge(number);
        System.out.println(number);
    }
}
