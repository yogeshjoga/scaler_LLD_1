package MockPrepLLD1;

public class MockPrepLLD1 {

    // encapulation
    class Encap{
        private int age;
        private String name;

        public Encap(int age, String name){
            this.age = age;
            this.name = name;
        }

        public int getAge(){
            return this.age;
        }

        public String getName(){
            return this.name;
        }

        public void setAge(int age){
            this.age = age;
        }

        public void setName(String name){
            this.name = name;
        }
    }



    // class creation
    static class MyClass{
        int hello;
        int my;
        String name;

        // constructor creation
        public MyClass(){} // Defalult constructor

        public MyClass(int hello, int my, String name){  // arugment constructor
            this.hello = hello;
            this.my = my;
            this.name  = name;
        }


        // for deep copy we need to implement a copy constructor

        public MyClass(MyClass myClass){
            this.hello = myClass.hello;
            this.my = myClass.my;
            this.name = myClass.name;
        }

        //copy constructor for an object
        MyClass copy = new MyClass(hello, my, name);
        // shallow copy

        MyClass shallowCopy = copy;

        // Deep copy

        MyClass deepCopy = new MyClass(copy);



        //----------------------------------------------------------

        // pass by reference and pass by value

        // pass by reference
        int value = 10;

        public void passByValue(int value){
            value += 10;
        }

        public void passByReference(MyClass myClass){
          myClass.value = 100;// pass by reference is used only reference objection
        }



        public static void main(String[] args) {
            MyClass obj = new MyClass();
            System.out.println(obj.value);

        }

    }

    // object cration
    Encap encap = new Encap(24,"yogi");


    // constructers



}
