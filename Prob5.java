import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the Value of X:");
            int X = scanner.nextInt();
           for(int i=0; i<X; i++){
           System.out.println(X);
           }
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            scanner.close();
        }
    }
}
