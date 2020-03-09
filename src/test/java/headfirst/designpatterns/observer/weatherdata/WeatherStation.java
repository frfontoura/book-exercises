package headfirst.designpatterns.observer.weatherdata;

import edu.headfirst.designpatterns.observer.weatherdata.*;

import java.util.Observable;

/**
 * @author frfontoura
 * @version 1.0 09/03/2020
 */
public class WeatherStation {

    public static void main(String[] args) {
        final WeatherData weatherData = new WeatherData();

        final CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        final StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        final ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        final HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}
