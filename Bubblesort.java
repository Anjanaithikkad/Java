import java.util.Scanner;

public class Bsort {

    public static void bubbleSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Compare strings ignoring case
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear newline

        String[] arr = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextLine();

        bubbleSort(arr);

        System.out.println("Sorted strings:");
        for (String s : arr) System.out.print(s + " ");

        sc.close();
    }
}









Enter number of strings: 3
Enter 3 strings:
Sirin
allu
krish
Sorted strings:
allu krish Sirin 
















Start

    1.The program asks the user to enter the number of strings they want to sort.

    2.It then prompts the user to input each of those strings and stores them in an array.

    3.The program sorts the array of strings using a bubble sort algorithm, where strings are compared without considering letter case.

    4.After sorting, the program prints the sorted strings to the console.

    5.Finally, the program ends.

Stop
