package SolidPrinciple.LiskovSubstitution.bad;

import java.io.IOException;
import java.nio.file.AccessDeniedException;

public class WithDrawableAccount {

    Account account;
   public void withDraw(Account account, double amount) throws IOException {
       account.withDraw(amount);
    }
}

 class Account{
    void withDraw(double amount) throws IOException  {

    }
}

class CurrentAccount extends Account{
    @Override
    void withDraw(double amount) throws IOException {
        super.withDraw(amount);
    }
}

class SavingAccount extends Account{
    @Override
    void withDraw(double amount) throws IOException {
        super.withDraw(amount);
    }
}

