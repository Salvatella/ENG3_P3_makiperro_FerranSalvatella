package mvc.read_only;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mvc.Observer;
import mvc.Subject;
import mvc.control_read.TemperatureModelInterface;

public class ReadOnlyTemperatureModel implements Runnable, TemperatureModelInterface, Subject {
    /*TODO: Ensure that ReadOnlyTemperatureModel implements the corresponding interface (other than Runnable)*/

    private int currentTemperature;
    private List<Observer> observerList;
    private Thread thread;
    private boolean stopThread;

    public ReadOnlyTemperatureModel(){
        Random rand = new Random();
        observerList = new ArrayList<>();
        currentTemperature = rand.nextInt(-30,40);
    }


    @Override
    public void on() {
        thread = new Thread(this);
        thread.start();
        stopThread = false;
        //TODO: may require additional code
        notifyObservers(currentTemperature, 0); // Assuming target temperature is 0 for now

    }

    @Override
    public void off() {
        stopThread = true;
        thread.interrupt();
        //TODO: may require additional code
    }

    /*TODO: Complete with appropriate methods and ensure that they work as expected. You may also need to add code to
     *  on and off methods above*/

    @Override
    public void run() {
        while (!stopThread) {
            try {
                Thread.sleep(2000);
                Random rand = new Random();
                currentTemperature += rand.nextInt(-1, 2);
                System.out.println("Current temperature " + currentTemperature); //This is left for easier debugging
                //TODO: View should be updated
                
            } catch (Exception e) {

            }
        }
        stopThread = false;
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
        return currentTemperature;
    }


    @Override
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub

        if (observer != null) {
            observerList.add(observer);
        }
    }


    @Override
    public void removeObserver(Observer observer) {
        // TODO Auto-generated method stub
        if (observer != null) {
            observerList.remove(observer);
        }
    }


    @Override
    public void notifyObservers(int currentTemperature, int targetTemperature) {
        // TODO Auto-generated method stub

        for (Observer observer : observerList) {
            observer.update(currentTemperature, targetTemperature);
        }

    }
}
