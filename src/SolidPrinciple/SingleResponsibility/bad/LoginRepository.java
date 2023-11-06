package SolidPrinciple.SingleResponsibility.bad;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoginRepository {
    private final FirebaseAuth firebaseAuth;

    public LoginRepository(FirebaseAuth firebaseAuth) {
        this.firebaseAuth = firebaseAuth;
    }

    public void doLogin(String email, String password) throws IOException {
        try {
            firebaseAuth.loginWithEmailAndPassword(email,password);
        }catch (Exception e){
            File file = new File("error_file_path");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(e.toString());
        }
    }
}
