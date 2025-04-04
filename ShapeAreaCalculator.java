import java.util.Scanner;

public class ShapeAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu for shape selection
        System.out.println("Select the shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        double area = 0;

        // Switch case to handle each shape's area calculation
        switch (choice) {
            case 1: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;  // Area = πr^2
                break;
            case 2: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;  // Area = length * width
                break;
            case 3: // Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;  // Area = 0.5 * base * height
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);  // Exit the program if an invalid choice is made
        }

        // Display the calculated area
        System.out.println("The area of the selected shape is: " + area);
        scanner.close();
    }
}

