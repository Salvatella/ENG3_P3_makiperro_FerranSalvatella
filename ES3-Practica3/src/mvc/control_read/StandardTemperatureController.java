package mvc.control_read;

import mvc.TemperatureView;

public class StandardTemperatureController implements TemperatureControllerInterface {
    /*TODO: Ensure that it implements the right interface*/

    TemperatureModelInterface model;
    TemperatureView view;

    public StandardTemperatureController(TemperatureModelInterface model){
        /*TODO: Create view and assign class attributes*/
        this.model = model;
        this.view = new TemperatureView(this, model);
        this.model.addObserver(view);
        view.createView();
        view.createControls();
        /*TODO: Prepare UI */
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
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
