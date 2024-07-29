package LLD2.DesignPatterns.builder;


public class Client {

    public static void main(String[] args) {

        Builder student = Student.getBuilder();

        Student st = Student.getBuilder()
                .setAge(19)
                .setName("Yogesh joga")
                .setBatch("may jun")
                .build();
    }

}
