import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

  System.out.println("Enter three angles:");
        // Taking inputs from the user
        int a = scanner.nextInt();  
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int d = a+b+c;
        
        if(d == 180){
             System.out.println("Triangle has be formed");
        }else{
            System.out.println("Triangle cannot be formed");
        }

        scanner.close();
  }
}

Method 2 :
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter three angles:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int sum = a + b + c;
            System.out.println(sum == 180 ? "Triangle has been formed" : "Triangle cannot be formed");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            scanner.close();
        }
    }
}

