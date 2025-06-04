package ro.ulbs.paradigme.lab10.dataprocessing;

import ro.ulbs.paradigme.lab10.storage.SensorData;

public interface StepCountStrategy {
    void consumeMessage(SensorData sample);
    int getTotalSteps();
    String getStrategyDescription();
}
