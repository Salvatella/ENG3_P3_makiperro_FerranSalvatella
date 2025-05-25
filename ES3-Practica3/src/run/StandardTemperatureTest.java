package run;

import mvc.control_read.StandardTemperatureController;
import mvc.control_read.StandardTemperatureModel;
import mvc.control_read.TemperatureControllerInterface;
import mvc.control_read.TemperatureModelInterface;

public class StandardTemperatureTest {

    public static void main (String[] args) {
        TemperatureModelInterface model = new StandardTemperatureModel();
        TemperatureControllerInterface controller = new StandardTemperatureController(model);
    }


}
