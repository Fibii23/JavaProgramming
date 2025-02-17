public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        long firstnum = 0, secondnum = 1;
        
        System.out.print("Fibonacci Series: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(firstnum + " ");
            long next = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = next;
        }
    }
}
