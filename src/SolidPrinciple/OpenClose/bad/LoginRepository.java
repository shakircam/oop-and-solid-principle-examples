package SolidPrinciple.OpenClose.bad;


public class LoginRepository {

    private FirebaseAuth firebaseAuth;
    private FileLogger fileLogger;

    public void login(String email, String password){
        try{
            firebaseAuth.loginWithEmailAndPassword(email,password);
        }catch (Exception e){
            fileLogger.logError(e.toString());
        }
    }
}
