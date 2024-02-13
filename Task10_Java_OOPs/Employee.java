package task10_programs;

public class Employee {
    
    private int ID;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int ID, String firstName, String lastName, int salary) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter methods
    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method to get annual salary
    public int getAnnualSalary() {
        return salary * 12; // Assuming salary is monthly salary
    }

    // Method to raise salary by a specified percentage
    public void raiseSalary(int percent) {
        double raise = salary * (percent / 100.0);
        salary += raise;
    }

    // toString method to represent Employee information
    @Override
    public String toString() {
        return "Employee[ID=" + ID + ", Name=" + getName() + ", Salary=" + salary + "]";
    }

 
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John", "Doe", 50000);

        System.out.println("Original Employee Details:");
        System.out.println(employee);
 
        employee.raiseSalary(10);

        System.out.println("\nEmployee Details after Salary Raise:");
        System.out.println(employee);
    }
}


