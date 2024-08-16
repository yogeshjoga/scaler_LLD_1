package MockPrepLLD1;

public class Inher {

     class Dog extends Animal{

        private String name;
        private int age;

        Dog(){}
        Dog (String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override // method overriding run time polymorphsim
        public void eat() {
            System.out.println("I AM EATING");
        }

        @Override
        public void sleep(){
            System.out.println("I am sleeping");
        }
    }


   class Cat{
        private String name;
        private int age;
        Cat(){}
        Cat (String name, int age){
            this.name = name;
            this.age = age;
        }
    }

     abstract class Animal{
        private String name;
        private int age;

        public abstract void eat();
        public abstract void sleep();

    }


    public static void main(String[] args) {

    }



}
