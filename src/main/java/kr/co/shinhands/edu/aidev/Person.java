package kr.co.shinhands.edu.aidev;

public class Person {
    private String name;
    private int age;
    private String address;
    private String phone;
    private String email;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private boolean vailidateAge() {
        if (this.age < 0) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
