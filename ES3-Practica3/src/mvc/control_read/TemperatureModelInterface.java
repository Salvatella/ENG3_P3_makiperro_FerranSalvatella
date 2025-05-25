package mvc.control_read;

public interface TemperatureModelInterface {
    void on();
    void off();
    void setTargetTemperature(int temp);
    int getTargetTemperature();
    int getCurrentTemperature();
}
