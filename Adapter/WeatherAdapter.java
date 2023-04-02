package Adapter;

public class WeatherAdapter {

    public int findTemperature(int zipcode){
        String city = null;

        if(zipcode == 22305){
            city = "Hamburg";
        }

        WeatherFInder finder = new WaetherFinderImpl();
        int temperature = finder.find(city);

        return temperature;
    }
}
