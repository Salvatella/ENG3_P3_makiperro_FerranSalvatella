package mvc.read_only;

import mvc.Observer;
import mvc.TemperatureView;
import mvc.control_read.Subject;
import mvc.control_read.TemperatureControllerInterface;
import mvc.control_read.TemperatureModelInterface;

public class ReadOnlyTemperatureController implements TemperatureControllerInterface, Subject {
    /*TODO: Ensure that it implements the right interface*/

    private TemperatureView view;
    private TemperatureModelInterface model;

    public ReadOnlyTemperatureController(TemperatureModelInterface tempModel){
       /*TODO: Create view and assign class attributes*/
        this.model = tempModel;
        this.view = new TemperatureView(this, model, this);
        view.createControls();
        /*TODO: Prepare UI */
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub

        model.on();
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        model.off();
    }

    @Override
    public void increaseTemperature() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'increaseTemperature'");
    }

    @Override
    public void decreaseTemperature() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'decreaseTemperature'");
    }

    @Override
    public void setTemperature(int temp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTemperature'");
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

    /*TODO: Complete with the interface methods. Some tips below.*/

    /*TODO: Start method is invoked when the user clicks File->Start
     * It should invoke model.on
     * It should also prepare the UI, enabling and disabling the right elements
     *
     *  */


    /*TODO: Start method is invoked when the user clicks File->Stop
     * It should invoke model.off
     * It should also prepare the UI, enabling and disabling the right elements
     *
     *  */
}
