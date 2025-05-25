package mvc.control_read;

import mvc.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(int currentTemperature, int targetTemperature);

    void setTargetTemperature(int temp);

    int getTargetTemperature();

    int getCurrentTemperature();
    
}
