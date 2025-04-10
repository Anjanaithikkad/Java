import java.util.Scanner;

class Employee {
    String empId, name, address;
    double salary;

    // Constructor to initialize Employee object
    public Employee(String empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    // Method to display Employee details
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
    }

    // Teacher class is now nested inside Employee
    static class Teacher extends Employee {
        String department;
        String[] subjectsTaught;

        // Constructor to initialize Teacher object
        public Teacher(String empId, String name, double salary, String address, String department, String[] subjectsTaught) {
            super(empId, name, salary, address);
            this.department = department;
            this.subjectsTaught = subjectsTaught;
        }

        // Method to display Teacher details
        @Override
        public void display() {
            super.display();
            System.out.println("Department: " + department);
            System.out.print("Subjects Taught: ");
            for (String subject : subjectsTaught) {
                System.out.print(subject + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of teachers
        System.out.print("Enter the number of teachers: ");
        int numTeachers = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        // Loop to input details for each teacher and display them
        for (int i = 0; i < numTeachers; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");

            System.out.print("Employee ID: ");
            String empId = scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            System.out.print("Subjects taught (comma separated): ");
            String subjectsInput = scanner.nextLine();
            String[] subjectsTaught = subjectsInput.split(",");

            // Create Teacher object and display its details
            Teacher teacher = new Teacher(empId, name, salary, address, department, subjectsTaught);
            teacher.display();
        }

        scanner.close();  // Close the scanner object
    }
}

















Enter the number of teachers: 2

Enter details for Teacher 1:
Employee ID: 1001
Name: Sumalatha
Salary: 45000
Address: ABC House
Department: MBA
Subjects taught (comma separated): Business,Economics
Employee ID: 1001
Name: Sumalatha
Salary: 45000.0
Address: ABC House
Department: MBA
Subjects Taught: Business Economics 

Enter details for Teacher 2:
Employee ID: 1002
Name: Anita
Salary: 75000
Address: HTU House
Department: MCA
Subjects taught (comma separated): Operating System,ADBMS
Employee ID: 1002
Name: Anita
Salary: 75000.0
Address: HTU House
Department: MCA
Subjects Taught: Operating System ADBMS 
