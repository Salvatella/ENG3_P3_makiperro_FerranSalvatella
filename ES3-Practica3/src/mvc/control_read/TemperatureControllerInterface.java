package mvc.control_read;

public interface TemperatureControllerInterface {
    void start();
    void stop();
    void increaseTemperature();
    void decreaseTemperature();
    void setTemperature(int temp);
}
