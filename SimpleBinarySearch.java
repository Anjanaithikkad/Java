import java.util.Scanner;

public class SimpleBinarySearch {

    // Recursive binary search method
    public static int binarySearch(int[] arr, int target, int low, int high) {
        // Base case: If the range is invalid, the element is not found
        if (low > high) {
            return -1;
        }

        // Find the middle index
        int mid = (low + high) / 2;

        // Check if the middle element is the target
        if (arr[mid] == target) {
            return mid; // Element found at index mid
        }

        // If the target is greater, search the right half
        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, high);
        }

        // If the target is smaller, search the left half
        return binarySearch(arr, target, low, mid - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Array size and elements
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array before searching (Binary search works on sorted arrays)
        java.util.Arrays.sort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));

        // Input: Target element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(arr, target, 0, arr.length - 1);

        // Output the result
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found");
        }

        scanner.close();
    }
}

