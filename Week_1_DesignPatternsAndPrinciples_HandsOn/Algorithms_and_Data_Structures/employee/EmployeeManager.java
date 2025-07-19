package employee;

public class EmployeeManager {
    Employee[] employees = new Employee[100];
    int count = 0;

    public void add(Employee e) {
        employees[count++] = e;
    }

    public void search(int id) {
        for (int i = 0; i < count; i++)
            if (employees[i].employeeId == id)
                System.out.println("Found: " + employees[i].name);
    }

    public void delete(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                employees[i] = employees[count - 1];
                count--;
                break;
            }
        }
    }

    public void traverse() {
        for (int i = 0; i < count; i++)
            System.out.println(employees[i].name);
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.add(new Employee(101, "Sriya Avyakta", "Engineer", 70000));
        manager.add(new Employee(102, "Srija Anuhya", "Manager", 90000));
        manager.traverse();
        manager.search(101);
        manager.delete(101);
        manager.traverse();
    }
}