// Interface Student
interface Student {
    void showAcademicScore();
}

// Interface Sports
interface Sports {
    void showSportsScore();
}

// Class Result implementing both interfaces
class Result implements Student, Sports {
    private int academicScore = 85;  // Direct initialization
    private int sportsScore = 90;    // Direct initialization

    // Implement method from Student interface
    public void showAcademicScore() {
        System.out.println("Academic Score: " + academicScore);
    }

    // Implement method from Sports interface
    public void showSportsScore() {
        System.out.println("Sports Score: " + sportsScore);
    }

    // Display both scores
    public void displayResult() {
        showAcademicScore();
        showSportsScore();
    }
}

// Main class renamed to Interface
public class Interface {
    public static void main(String[] args) {
        Result studentResult = new Result();
        studentResult.displayResult();
    }
}



ksb@ksb-H410M-S2-V2:~/Anj7/OOps$ javac Interface.java
(base) ksb@ksb-H410M-S2-V2:~/Anj7/OOps$ java Interface
Academic Score: 85
Sports Score: 90
