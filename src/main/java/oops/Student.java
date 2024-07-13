package oops;

public class Student {

    int rollNum ;
    String name;
    int age;

    // constructor
    Student() {}
    Student(String name){
        this();
        this.name=name;
    }
    Student(int rollNum){
        this();
        this.rollNum=rollNum;
    }

    Student(int rollNum, String name, int age) {
        this.rollNum = rollNum;
        this.name = name;
        this.age = age;
    }

}
