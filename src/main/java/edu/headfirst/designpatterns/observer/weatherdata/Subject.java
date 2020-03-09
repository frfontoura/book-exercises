package edu.headfirst.designpatterns.observer.weatherdata;

/**
 * @author frfontoura
 * @version 1.0 09/03/2020
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
