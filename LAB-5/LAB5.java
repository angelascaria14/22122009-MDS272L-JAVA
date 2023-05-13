
import java.util.Scanner;

public class LAB5 {

    static String User(Scanner sc) {
        System.out.print("Enter any message: ");
        sc.nextLine(); // consume the newline character
        return sc.nextLine();
    }

    
    static String encryptMessage(String InputStr) {
        String cypher = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        String encryptedMessage = "";
        for (int i = 0; i < InputStr.length(); i++) {
            char ch = InputStr.charAt(i);
            if (Character.isLetter(ch)) {
                char encryptedChar = cypher.charAt(Character.toUpperCase(ch) - 65);
                if (Character.isLowerCase(ch)) {
                    encryptedMessage += Character.toUpperCase(encryptedChar);
                } else {
                    encryptedMessage += encryptedChar;
                }
            } else {
                encryptedMessage += ch;
            }
        }
        return encryptedMessage;
    }

    static String decryptMessage(String encryptedMessage) {
        String cypher = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        String decryptedMessage = "";
        for (int i = 0; i < encryptedMessage.length(); i++) {
            char ch = encryptedMessage.charAt(i);
            if (Character.isLetter(ch)) {
                char decryptedChar = (char) (cypher.indexOf(Character.toUpperCase(ch)) + 65);
                if (Character.isLowerCase(ch)) {
                    decryptedMessage += Character.toUpperCase(decryptedChar);
                } else {
                    decryptedMessage += decryptedChar;
                }
            } else {
                decryptedMessage += ch;
            }
        }
        return decryptedMessage;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu-Driven Program:");
            System.out.println("1. Encrypt a message\t"+"2. Decrypt a message\t"+"3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    String message = User(sc);
                    String encryptedMessage = encryptMessage(message);
                    System.out.println("Encrypted message: " + encryptedMessage);
                    break;
                case 2:
                    String encryptedMsg = User(sc);
                    String decryptedMessage = decryptMessage(encryptedMsg);
                    System.out.println("Decrypted message: " + decryptedMessage);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 3);
    }
>>>>>>> b093f03388adfd436e9129dffc41d7f5edee3dd6
}
