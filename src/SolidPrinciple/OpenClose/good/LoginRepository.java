package SolidPrinciple.OpenClose.good;

public class LoginRepository {
    LoginCredential loginCredential;
    FileLogger fileLogger;

    public LoginRepository(LoginCredential loginCredential, FileLogger fileLogger) {
        this.loginCredential = loginCredential;
        this.fileLogger = fileLogger;
    }

    public void login(String email, String password){
        try{
            loginCredential.doLogin(email,password);
        }catch (Exception e){
            fileLogger.logError(e.toString());
        }
    }
}
