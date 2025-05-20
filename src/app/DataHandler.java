package app;

import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {
    String[] myData = new DataRepository().getData();

    public void getOutput() {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            AtomicInteger count = new AtomicInteger(1);
            for (String fruit : myData) {
                sb.append(String.format("(%d) %s ", count.getAndIncrement(), fruit));
            }
            System.out.println(Thread.currentThread().getName() + ":" + sb);
        }
    }
}
