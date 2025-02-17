import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the Value of X and Y:");
            int X = scanner.nextInt();
            int Y = Scanner.nextInt();
           
           for(int i=0; i<Y; i++){
           System.out.println(X);
           }
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            scanner.close();
        }
    }
}
