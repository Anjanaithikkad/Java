class MultiplicationTable extends Thread {
    public void run() {
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

class PrimeNumbers extends Thread {
    int n;
    PrimeNumbers(int n) { this.n = n; }

    public void run() {
        System.out.println("First " + n + " Prime Numbers:");
        int count = 0, num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) return false;
        return num > 1;
    }
}

public class MulPrimenum {
    public static void main(String[] args) {
        Thread tableThread = new MultiplicationTable();
        Thread primeThread = new PrimeNumbers(10);

        tableThread.start();
        try { tableThread.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        primeThread.start();
        try { primeThread.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("Both threads have finished.");
    }
}








Multiplication Table of 5:
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
First 10 Prime Numbers:
2 3 5 7 11 13 17 19 23 29 
Both threads have finished.








Start
→ Initialize a thread for displaying the multiplication table of 5
→ Start the multiplication table thread
→ Wait until the multiplication thread completes execution
→ Initialize a thread for displaying the first 10 prime numbers
→ Start the prime numbers thread
→ Wait until the prime number thread completes execution
→ Display message indicating both threads have completed
End
