import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
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
