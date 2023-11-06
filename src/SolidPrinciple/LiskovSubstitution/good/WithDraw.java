package SolidPrinciple.LiskovSubstitution.good;

import java.io.IOException;

public class WithDraw {
    void withDraw(double amount) throws IOException {
        System.out.println("WithDraw amount: " + amount);
    }
}
