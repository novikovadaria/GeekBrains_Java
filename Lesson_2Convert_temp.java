interface Converter {
    double convertValue(double baseValue);
}

class CelsiusConverter implements Converter {
    @Override
    public double convertValue(double baseValue) {
        return baseValue;
    }
}

class KelvinConverter implements Converter {

    @Override
    public double convertValue(double baseValue) {
        return baseValue + 273.15;
    }
}

class FahrenheitConverter implements Converter {
    @Override
    public double convertValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}

public class  temp_convert{
    public static void main(String[] args) {
        double temperature = 12;
        System.out.println("Celsius t = " + 
                new CelsiusConverter().convertValue(temperature));
        System.out.println("Kelvin t = " + 
                new KelvinConverter().convertValue(temperature));
        System.out.println("Fahrenheit t = " + 
                new FahrenheitConverter().convertValue(temperature));
    }
}
