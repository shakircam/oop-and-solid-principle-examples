package SolidPrinciple.DependencyInversion.bad;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Developer> developers = new ArrayList<>();
    private List<Designer> designers = new ArrayList<>();
    private List<Tester> testers = new ArrayList<>();

    public void addDeveloper(Developer dev) {
        developers.add(dev);
    }

    public void addDesigner(Designer design) {
        designers.add(design);
    }

    public void addTester(Tester tester) {
        testers.add(tester);
    }
}

class Developer {
    public Developer() {
        System.out.println("Developer added");
    }
}

class Designer {
    public Designer() {
        System.out.println("Designer added");
    }
}

class Tester {
    public Tester() {
        System.out.println("Tester added");
    }
}
