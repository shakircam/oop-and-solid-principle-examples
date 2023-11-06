package SolidPrinciple.LiskovSubstitution.good;

import java.io.IOException;
import java.nio.file.AccessDeniedException;

public class WithDrawableAccount {
    public double amount;
   public void withDraw(WithDraw account,double amount) throws IOException {
        account.withDraw(amount);
    }
}

class Account{
    void withDraw1(double amount) throws IOException  {

    }
}


class CurrentAccount extends WithDraw {
    @Override
    void withDraw(double amount) throws IOException {
        super.withDraw(amount);
    }
}

