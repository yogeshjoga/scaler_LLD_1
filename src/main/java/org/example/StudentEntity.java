package org.example;

public class StudentEntity {
    /**
     * @since
     * @au
     *
     */
    private int id;
    private  String firstName;
    private  String lastName;
    private  int age;
    private  String email;
    private  String phone;
    private String batch_name;
    private  String buddy_id;

    /**
     * @param id
     * @param firstName
     * @param lastName
     * @param age
     * @param email
     * @param phone
     * @param batch_name
     * @param buddy_id
     */
    StudentEntity(int id, String firstName, String lastName, int age, String email, String phone, String batch_name, String buddy_id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.batch_name = batch_name;
        this.buddy_id = buddy_id;
    }


    /**
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBatch_name() {
        return batch_name;
    }

    public void setBatch_name(String batch_name) {
        this.batch_name = batch_name;
    }

    public String getBuddy_id() {
        return buddy_id;
    }

    public void setBuddy_id(String buddy_id) {
        this.buddy_id = buddy_id;
    }
}
