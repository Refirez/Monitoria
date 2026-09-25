//questao3 AV1
package classes;

public class ConversorTemperatura {
    public static final double KELVIN_OFFSET = 273.15;

    public static double celsiusParaFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

    public static class TesteConversor{
        public static void main(String[] args){

            System.out.println(ConversorTemperatura.celsiusParaFahrenheit(100));
            System.out.println(ConversorTemperatura.fahrenheitParaCelsius(210));

        }
    }
}
