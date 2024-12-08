package Lista02;

public class E18ParametroERetornoCelsiusToFahrenheit {

    static float ConverterCelsiusParaFahrenheit(float celsius) {
        return (celsius * (9f / 5f)) + 32f;
    }

    public static void main(String[] args) {
        float celsius = 100f;
        System.out.println(celsius + "Cº é igual a: " +
                String.format("%.2f", ConverterCelsiusParaFahrenheit(celsius)) + "Fº");

        float fahrenheit = 100f;
        System.out.println(fahrenheit + "Fº é igual a: " +
                String.format("%.2f", ConverterFahrenheitParaCelsius(fahrenheit)) + "Cº");
    }

    static float ConverterFahrenheitParaCelsius(float fahrenheit) {
        return (5f / 9f) * (fahrenheit - 32f);
    }

}
