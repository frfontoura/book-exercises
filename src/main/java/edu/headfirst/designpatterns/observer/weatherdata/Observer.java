package edu.headfirst.designpatterns.observer.weatherdata;

/**
 * @author frfontoura
 * @version 1.0 09/03/2020
 */
public interface Observer {

    void update(float temperature, float humidity, float pressure);
}
