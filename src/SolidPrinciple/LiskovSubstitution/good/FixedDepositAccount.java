package SolidPrinciple.LiskovSubstitution.good;

import java.io.IOException;
import java.nio.file.AccessDeniedException;

public class FixedDepositAccount extends Account {

    @Override
    void withDraw1(double amount) throws IOException {
        throw new AccessDeniedException("This account has no permission for withdraw");
    }

}
