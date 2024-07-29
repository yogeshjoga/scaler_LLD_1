package LLD2.DesignPatterns.builder;


/**
 *
 * Builder class for making abstract to Student
 *
 */
public class Builder {

    private int age;
    private String name;
    private String batch;
    private int gradYear;


    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public Builder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public int getGradYear() {
        return gradYear;
    }

    public Builder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }


    // building new Student object
    public Student build(){
        return new Student(this);
    }

}
