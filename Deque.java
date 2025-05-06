import java.util.*;

public class deque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a deque using LinkedList
        Deque<String> dq = new LinkedList<>();

        // Taking user input to add elements
        System.out.print("Enter number of elements to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = scanner.nextLine();
            dq.add(element);
        }

        // Display deque elements
        System.out.println("\nDeque after adding elements: " + dq);

        // Remove head using remove() method
        String removedByRemove = dq.remove();  // throws exception if empty
        System.out.println("Element removed using remove(): " + removedByRemove);
        System.out.println("Deque after remove(): " + dq);

        // Remove next head using poll() method
        String removedByPoll = dq.poll();  // returns null if empty
        System.out.println("Element removed using poll(): " + removedByPoll);
        System.out.println("Deque after poll(): " + dq);

        // Remove last element using pollLast() method
        String removedByPollLast = dq.pollLast();  // returns null if empty
        System.out.println("Element removed using pollLast(): " + removedByPollLast);
        System.out.println("Deque after pollLast(): " + dq);

        scanner.close();
    }
}




Enter number of elements to add: 5
Enter element 1: soja
Enter element 2: sreya
Enter element 3: Anjana
Enter element 4: Nada
Enter element 5: Sreelakshmi

Deque after adding elements: [soja, sreya, Anjana, Nada, Sreelakshmi]
Element removed using remove(): soja
Deque after remove(): [sreya, Anjana, Nada, Sreelakshmi]
Element removed using poll(): sreya
Deque after poll(): [Anjana, Nada, Sreelakshmi]
Element removed using pollLast(): Sreelakshmi
Deque after pollLast(): [Anjana, Nada]






Algorithm:

    Initialize a Scanner object to read user input.

    Create a Deque<String> using LinkedList to store the elements.

    Prompt the user to enter the number of elements (n) to be added to the deque.

    Loop through n times to:

        Read each element as a String using the Scanner.

        Add the element to the deque using the add() method.

    Display the deque after adding all the elements.

    Remove the first element from the deque using the remove() method and display the updated deque.

    Remove the next head element using the poll() method and display the updated deque.

    Remove the last element using the pollLast() method and display the updated deque.

    Close the Scanner object to free resources.
