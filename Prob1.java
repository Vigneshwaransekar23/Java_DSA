import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Taking inputs from the user
        int intValue = scanner.nextInt();  // Reads an integer
        String strValue = scanner.next();  // Reads a string
        char charValue = scanner.next().charAt(0);  // Reads a character

        // Printing the inputs
        System.out.println(intValue);
        System.out.println(strValue);
        System.out.println(charValue);

        scanner.close();
    }
}
