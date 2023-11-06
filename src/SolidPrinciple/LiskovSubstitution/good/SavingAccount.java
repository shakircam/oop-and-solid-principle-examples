package SolidPrinciple.LiskovSubstitution.good;

import java.io.IOException;

public class SavingAccount extends WithDraw {
    @Override
    void withDraw(double amount) throws IOException {
        super.withDraw(amount);
    }
}
