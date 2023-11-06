package Polymorphism;

import java.util.ArrayList;

public class CompileTimePolymorphism {
    public void insertUser(){

        User user = new User();
        user.insertUser(user); // Here passing single user

        user.insertUser(getUserList());  // Here passing list of user
    }

    private ArrayList<User> getUserList(){
        ArrayList<User> userList = new ArrayList<>();
        User user = new User();
        userList.add(user);
        return userList;
    }
}
