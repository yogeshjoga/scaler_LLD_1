package comparatorAndComparable;


public class Students implements  Comparable<Students>{

    private String name;
    private int age;

    public Students(){}

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        return this.age > o.age ? 1 : 0;
    }
}
