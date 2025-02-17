import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the Value of fristName:");
            System.out.println("Enter the Value of lastName:");
            System.out.println("Enter the Value of n:");
            String firstName = scanner.next();
            String lastName = scanner.next();
            int n = scanner.nextInt();
           for(int i=0; i<n; i++){
           System.out.println(firstName+lastName);
           }
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            scanner.close();
        }
    }
}
