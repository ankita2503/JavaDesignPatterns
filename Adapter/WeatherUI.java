package Adapter;

public class WeatherUI {

    public static int showTemperature(int zipcode) {

        WeatherAdapter adapter = new WeatherAdapter();
        return adapter.findTemperature(zipcode);

    }

    public static void main(String[] args) {
        System.out.println("Temperature is : " + showTemperature(22305));
    }
}
