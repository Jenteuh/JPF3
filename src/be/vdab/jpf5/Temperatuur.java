package be.vdab.jpf5;

public class Temperatuur {

    public static void main(String[] args) {
        float tempCelsius = 37.0F;
        float tempFahr = tempCelsius * 9 / 5 + 32;
        System.out.println("Temperatuur in graden Celsius: " +
                tempCelsius);
        System.out.println("Temperatuur in graden Fahrenheit: " +
                tempFahr);
    }
}
