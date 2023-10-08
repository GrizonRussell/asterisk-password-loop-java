// import java.io.Console;

// public class password {
//     public static void main(String[] args) {
//         Console console = System.console();
//         if (console == null) {
//             System.out.println("Console not available. Exiting.");
//             System.exit(1);
//         }

//         System.out.print("Enter your password: ");
//         char[] password = console.readPassword();

//         System.out.print("Password: ");
//         for (char c : password) {
//             System.out.print("*");
//         }
//         System.out.println("\nPassword Entered Successfully!");
//     }
// }

import java.io.Console;

public class password {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("Console not available. Exiting.");
            System.exit(1);
        }

        String correctPassword = "admin"; // Replace with the correct password
        boolean passwordEntered = false;

        while (!passwordEntered) {
            System.out.print("Enter your password: ");
            char[] password = console.readPassword();

            System.out.print("Password: ");
            for (char c : password) {
                System.out.print("*");
            }

            if (new String(password).equals(correctPassword)) {
                passwordEntered = true;
                System.out.println("\nPassword Entered Successfully!");
            } else {
                System.out.println("\nIncorrect password. Please try again.");
            }
        }
    }
}