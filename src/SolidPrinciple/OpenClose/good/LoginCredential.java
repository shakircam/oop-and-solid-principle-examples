package SolidPrinciple.OpenClose.good;

import SolidPrinciple.SingleResponsibility.bad.FirebaseAuth;

public interface LoginCredential {
    void doLogin(String email,String Password);
}


class FirebaseLogin implements LoginCredential{
    FirebaseAuth firebaseAuth;
    @Override
    public void doLogin(String email, String Password) {
     firebaseAuth.loginWithEmailAndPassword(email, Password);
    }
}


class CustomLoginService implements LoginCredential{

    @Override
    public void doLogin(String email, String Password) {
      // API call in Custom login server for custom login with token.
    }
}