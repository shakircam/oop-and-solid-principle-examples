package SolidPrinciple.DependencyInversion.good;

public class Employee {
    void work() {
        // Default implementation
    }
}

class Developer extends Employee {
    Developer() {
        System.out.println("Developer added");
    }

    @Override
    void work() {
        System.out.println("Turning coffee into code");
    }
}

class Designer extends Employee {
    Designer() {
        System.out.println("Designer added");
    }

    @Override
    void work() {
        System.out.println("Turning lines into wireframes");
    }
}

class Tester extends Employee {
    Tester() {
        System.out.println("Tester added");
    }

    @Override
    void work() {
        System.out.println("Testing everything out there");
    }
}
