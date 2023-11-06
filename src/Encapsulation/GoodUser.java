package Encapsulation;

public class GoodUser {
    private String name = "Aminul Islam";
    private int age = 64;
    private String address = "Dhaka";

    public GoodUser(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getUserInfo(){
        return  this.name + this.age + this.address + getUserLocation();
    }

    private String getUserLocation(){
        // Suppose, i need a api call to get a user current lat & lon
        return "Lat: 80.09 Lon: 20.58";
    }

}



