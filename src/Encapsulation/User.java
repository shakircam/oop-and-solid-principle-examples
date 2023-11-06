package Encapsulation;

public class User {
    public String name = "Islam";
    public int age = 30;
    public String address = "Dhaka";

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getUserInformation() {
        return "name \n" + this.name + "age \n" + this.age + "address \n" + this.address;
    }
}
