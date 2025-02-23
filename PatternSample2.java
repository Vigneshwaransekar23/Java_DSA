// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
            int n = 6;
            int m = n;
     for(int i=1; i<=n; i++){
         for(int j=m; j>=1; j--){
             System.out.print("*");
         }
          m--;
         System.out.println(" ");
     }
    }
}
