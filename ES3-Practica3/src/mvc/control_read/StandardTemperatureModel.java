package mvc.control_read;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mvc.Observer;

public class StandardTemperatureModel implements Runnable, TemperatureModelInterface, Subject {
    /*TODO: Ensure that  StandardTemperatureModel implements the corresponding interface (other than Runnable)*/

    private List<Observer> observers;
    private int targetTemperature;
    private int currentTemperature;
    private Thread thread;
    private boolean stopThread;


    public StandardTemperatureModel(){
        Random rand = new Random();
        currentTemperature = rand.nextInt(0,31);
        targetTemperature = currentTemperature;
        observers = new ArrayList<>();
        stopThread = false;
    }

    @Override
    public void on() {
        thread = new Thread(this);
        thread.start();
        //TODO: may require additional code
    }

    @Override
    public void off() {
        stopThread = true;
        thread.interrupt();
        //TODO: May require additional code
    }

    /*TODO: Complete with appropriate methods and ensure that they work as expected. You may also need to add code to
    *  on and off methods above*/

    @Override
    public void run() {
        while(!stopThread) {
            try {
                Thread.sleep(3000);
                //TODO: Add code here to ensure that current temperature moves towards target temperature (in +1 or -1 increments).
                //TODO: View should be updated
            } catch (Exception e) {

            }
        }
        stopThread = false; //We reset stopThread
    }

    @Override
    public void setTargetTemperature(int temp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTargetTemperature'");
    }

    @Override
    public int getTargetTemperature() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTargetTemperature'");
    }

    @Override
    public int getCurrentTemperature() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCurrentTemperature'");
    }

    @Override
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerObserver'");
    }

    @Override
    public void removeObserver(Observer observer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeObserver'");
    }

    @Override
    public void notifyObservers(int currentTemperature, int targetTemperature) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyObservers'");
    }


}
