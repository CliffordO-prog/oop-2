import java.io.Console;
import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        final String USERNAME = "admin";
        final String PASSWORD = "password123";
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);
        Console console = System.console();

        while (attempts < 3) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();

            String inputPassword;
            if (console != null) {
                char[] passwordChars = console.readPassword("Enter password: ");
                inputPassword = new String(passwordChars);
            } else {

                System.out.print("Enter password: ");
                inputPassword = maskPassword();
            }

            if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
                System.out.println("Login successful!");
                return;
            } else {
                System.out.println("Invalid username or password. Try again.");
                attempts++;
            }
        }

        System.out.println("Maximum attempts exceeded. Access denied.");
    }

    public static String maskPassword() {
        StringBuilder password = new StringBuilder();
        try {
            while (true) {
                int ch = System.in.read();
                if (ch == '\n' || ch == '\r') break;
                System.out.print("*");
                password.append((char) ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return password.toString();
    }
}
