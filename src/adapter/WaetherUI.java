package adapter;

public class WaetherUI {

    public int showTemperature(int zipCode) {
        WeatherFinderAdapter adapter = new WeatherFinderAdapter();
        int temperature = adapter.findTemperature(zipCode);
        return temperature;
    }
}
