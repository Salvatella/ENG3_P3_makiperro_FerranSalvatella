package run;

import mvc.control_read.TemperatureControllerInterface;
import mvc.control_read.TemperatureModelInterface;
import mvc.read_only.ReadOnlyTemperatureController;
import mvc.read_only.ReadOnlyTemperatureModel;

public class ReadOnlyTemperatureTest {

    public static void main (String[] args) {
        TemperatureModelInterface model = new ReadOnlyTemperatureModel();
        TemperatureControllerInterface controller = new ReadOnlyTemperatureController(model);
        
    }
}
