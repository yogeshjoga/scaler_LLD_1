package LLD2.DesignPatterns.builder;

public class Student {


    int age;
    String name;
    String batch;
    int gradYear;

    Student(Builder builder){
        if(builder.getAge() < 10){
            throw new IllegalArgumentException("Age must be at least 10");
        }

        if(builder.getGradYear() > 2024){
            throw new IllegalArgumentException("Grad year must be 2024");
        }

        this.age = builder.getAge();
        this.name = builder.getName();
        this.batch = builder.getBatch();
        this.gradYear = builder.getGradYear();
    }


    // Get a new Builder
    public static Builder getBuilder(){
        return new Builder();
    }


}
