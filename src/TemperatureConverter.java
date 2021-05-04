import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру по шкале Цельсия, С°:");
        double celsiusTemperature = scanner.nextDouble();

        double fahrenheitTemperature = getFahrenheitTemperature(celsiusTemperature);
        System.out.println("По шкале Фаренгейта температура равна " + fahrenheitTemperature + " F°");

        double kelvinTemperature = getKelvinTemperature(celsiusTemperature);
        System.out.println("По шкале Кельвина температура равна " + kelvinTemperature + " K°");
    }

    private static double getKelvinTemperature(double celsiusTemperature) {
        return celsiusTemperature - 273.15;
    }

    private static double getFahrenheitTemperature(double celsiusTemperature) {
        return 5 * (celsiusTemperature - 32) / 9;
    }
}