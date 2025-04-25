import java.util.Scanner;

// Custom Exception Class
class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

// Authentication Logic (Main Class)
public class Authentication {

    // Hardcoded valid credentials
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    // Method to authenticate user
    public static void authenticate(String username, String password) throws AuthenticationException {
        if (!username.equals(VALID_USERNAME) || !password.equals(VALID_PASSWORD)) {
            throw new AuthenticationException("Invalid username or password!");
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the login credentials
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Try to authenticate the user
        try {
            authenticate(username, password);  // If credentials match, proceed to try block
            System.out.println("Login successful!");
        } catch (AuthenticationException e) {  // If credentials do not match, proceed to catch block
            System.out.println("Authentication failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}




















ksb@ksb-H410M-S2-V2:~/Anj7/OOps$ javac Authentication.java
(base) ksb@ksb-H410M-S2-V2:~/Anj7/OOps$ java Authentication
Enter your username: Anjana
Enter your password: Anj123
Authentication failed: Invalid username or password!
(base) ksb@ksb-H410M-S2-V2:~/Anj7/OOps$ java Authentication
Enter your username: admin
Enter your password: password123
Login successful!







   1. Start

   2. Define VALID_USERNAME = "admin" and VALID_PASSWORD = "password123".

   3. Prompt user for username and password.

   4. If entered username and password match VALID_USERNAME and VALID_PASSWORD, print "Login successful!".

   5. Otherwise, throw AuthenticationException with message "Invalid username or password!".

   6. Catch the AuthenticationException and print the error message.

   7. End

