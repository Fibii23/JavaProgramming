public class Factorial {
    public static void main(String[] args) {
        int n = 3;
        long factorial = 1;
        
        if (n >= 2) {
            int i = 2; 
            do {
                factorial *= i;
                i++;
            } while (i <= n);
        }
        
        System.out.println("Factorial: " + factorial);
    }
}
