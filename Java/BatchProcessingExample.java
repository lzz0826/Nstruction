package Java;

import java.util.ArrayList;
import java.util.List;

//批處理
public class BatchProcessingExample {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        for (int i = 1; i <= 250; i++) {
            data.add(i);
        }

        int batchSize = 100;
        int totalSize = data.size();
        int loopCount = (int) Math.ceil((double) totalSize / batchSize);

        for (int i = 0; i < loopCount; i++) {
            int start = i * batchSize;
            int end = Math.min(start + batchSize, totalSize);
            List<Integer> batch = data.subList(start, end);
            processBatch(batch);
        }
    }

    private static void processBatch(List<Integer> batch) {
        System.out.println("Processing batch: " + batch);
    }
}
