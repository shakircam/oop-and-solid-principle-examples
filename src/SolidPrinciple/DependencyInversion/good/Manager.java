package SolidPrinciple.DependencyInversion.good;
import java.util.ArrayList;
import java.util.List;
public class Manager {
    private List<Employee> employees = new ArrayList<>();

    void addEmployee(Employee a) {
        employees.add(a);
    }
}
