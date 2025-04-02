import java.util.Scanner;

class Employeee {
    int eNo, eSalary;
    String eName;

    Employeee(int eno, int esalary, String ename) {
        eNo = eno;
        eSalary = esalary;
        eName = ename;
    }

    void display() {
        System.out.println("\n Employee No: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}

class Employye {
    public static void main(String args[]) {
        int n, i, result = 0, eno, esal, enumber;
        String ename;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        n = sc.nextInt();

        Employeee Obj[] = new Employeee[n];
        
        // Loop to input employee details
        for (i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.println("Enter Employee No:");
            eno = sc.nextInt();
            System.out.println("Enter Employee Name:");
            ename = sc.next();
            System.out.println("Enter Employee Salary:");
            esal = sc.nextInt();

            Obj[i] = new Employeee(eno, esal, ename);
        }

        // Search for employee by employee number
        System.out.println("Enter the employee number to be searched:");
        enumber = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (Obj[i].eNo == enumber) {
                result = 1;
                Obj[i].display();
                break;
            }
        }

        if (result == 0) {
            System.out.println("Employee with number " + enumber + " not found.");
        }
    }
}

