import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{
    public static int binarySearch(int[] arr, int target) 
    {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) 
        {
            int mid = (low + high) / 2;
            if (arr[mid] == target) 
            {
                return mid;  
            }                      
            if (arr[mid] < target) 
            {
                low = mid + 1;
            }           
            else 
            {
                high = mid - 1;
            }
        }
        
        return -1;  
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        // Sorting the array before performing binary search
        Arrays.sort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();
        
        int result = binarySearch(arr, target);
        
        if (result != -1) 
        {
            System.out.println("Element " + target + " found at index " + result + ".");
        } 
        else 
        {
            System.out.println("Element " + target + " not found in the array.");
        }
        
        scanner.close();
    }
}

