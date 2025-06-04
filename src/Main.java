import ro.ulbs.paradigme.lab10.dataprocessing.*;
import ro.ulbs.paradigme.lab10.storage.SensorData;
import ro.ulbs.paradigme.lab10.storage.DataRepository;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StepCountStrategy basic = new BasicStepCountStrategy();
        StepCountStrategy filtered = new FilteredStepCountStrategy(DataRepository.getInstance());

        long now = System.currentTimeMillis();

        SensorData data1 = new SensorData(now, 500);
        SensorData data2 = new SensorData(now + 1000, 600); // 1100 in 1s
        SensorData data3 = new SensorData(now + 62000, 400); // în alt minut

        basic.consumeMessage(data1);
        basic.consumeMessage(data2);
        basic.consumeMessage(data3);

        filtered.consumeMessage(data1);
        filtered.consumeMessage(data2);
        filtered.consumeMessage(data3);

        System.out.println("Basic steps: " + basic.getTotalSteps()); // 1500
        System.out.println("Filtered steps: " + filtered.getTotalSteps()); // 900 (data2 ignorată)
    }
}

