package ro.ulbs.paradigme.lab10.storage;

public class SensorData {
    private final long timestamp;
    private final int stepsCount;

    public SensorData(long timestamp, int stepsCount) {
        this.timestamp = timestamp;
        this.stepsCount = stepsCount;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public int getStepsCount() {
        return stepsCount;
    }
}

