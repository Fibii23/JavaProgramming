public class ComparisonOperators {
    public static void main(String[] args) {
        int firstValue = 5;
        int secondValue = 10;

        System.out.println("Is x less than y? " + (firstValue < secondValue));
        System.out.println("Is x greater than or equal to y? " + (firstValue >= secondValue));
        System.out.println("Are both x and y greater than 0? " + (firstValue > 0 && secondValue > 0));
        System.out.println("Is x less than y OR x equal to 5? " + (firstValue < secondValue || firstValue == 5));
    }
}
