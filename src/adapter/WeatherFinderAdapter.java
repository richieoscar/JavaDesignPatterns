package adapter;

public class WeatherFinderAdapter {

    public int findTemperature(int zipCode) {
        String city = null;
        if (zipCode == 10001) {
            city = "Lagos";
        }
        WeatherFinder finder = new WeatherFinderImpl();
        int temp = finder.find(city);
        return temp;
    }
}
