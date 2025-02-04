public class TemperatureConverter {
    public static void main(String[] args) {
        double celsiusTemp = 25.0;
        double fahrenheitTemp = (celsiusTemp * 9 / 5) + 32;

        System.out.println("Temperature in Celsius: " + celsiusTemp);
        System.out.println("Temperature in Fahrenheit: " + fahrenheitTemp);
    }
}
