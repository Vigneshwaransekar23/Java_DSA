import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the student mark:");
            int a = scanner.nextInt(); 
            if(a >= 90){
             System.out.println("Grade A");
            }else if(a >= 80){
              System.out.println("Grade B");
              }else if(a >= 60){
                System.out.println("Grade C");
                }else if(a >= 35){
                  System.out.println("Grade D");
                  }else{
                    System.out.println("Fail");
                  }
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            scanner.close();
        }
    }
}
