package Polymorphism;

public class RunTimePolymorphism {

    public void userLogin(){

        User user = new User();  // Create user object
        User facebookUser = new FacebookUser();  // Create facebookUser object

        user.userLogin(user); // user login to default server
        user.userLogin(facebookUser); // user login to facebook server
        
    }
}
