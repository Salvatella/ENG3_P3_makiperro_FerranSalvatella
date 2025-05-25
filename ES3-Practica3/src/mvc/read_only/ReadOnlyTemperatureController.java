package mvc.read_only;

import mvc.TemperatureView;
import mvc.control_read.TemperatureControllerInterface;
import mvc.control_read.TemperatureModelInterface;

public class ReadOnlyTemperatureController implements TemperatureControllerInterface {
    /*TODO: Ensure that it implements the right interface*/

    private TemperatureView view;
    private TemperatureModelInterface model;

    public ReadOnlyTemperatureController(TemperatureModelInterface tempModel){
       /*TODO: Create view and assign class attributes*/
        this.model = tempModel;
        this.view = new TemperatureView(this, model);
        view.createView();
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
