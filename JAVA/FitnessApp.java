public class FitnessApp {

    public static void main(String[] args) {
        double weight = 70; 
        double height = 1.75; 
        System.out.println("BMI Category: " + calculateBMI(weight, height));
    }

    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
