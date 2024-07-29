public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(10);

        Employee e1 = new Employee("1", "Arnab", "Manager", 65000);
        Employee e2 = new Employee("2", "Aftab", "Developer", 60000);
        Employee e3 = new Employee("3", "George", "Analyst", 50000);

        system.addEmployee(e1);
        system.addEmployee(e2);
        system.addEmployee(e3);

        System.out.println("All Employees:");
        system.traverseEmployees();

        System.out.println("\nSearching for Employee 2:");
        Employee result = system.searchEmployee("2");
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee 2:");
        system.deleteEmployee("2");

        System.out.println("\nAll Employees after deletion:");
        system.traverseEmployees();
    }
}
