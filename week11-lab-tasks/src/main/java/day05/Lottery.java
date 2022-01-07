package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int numberOfNumbers;
    private int limit;
    private Random random = new Random();

    public Lottery(int numberOfNumbers, int limit) {
        this.numberOfNumbers = numberOfNumbers;
        this.limit = limit;
    }

    public int getNumberOfNumbers() {
        return numberOfNumbers;
    }

    public int getLimit() {
        return limit;
    }

    public List<Integer> startLottery() {
        List<Integer> drawnNumbers = new ArrayList<>();
        while (drawnNumbers.size() != numberOfNumbers) {
            int drawned = random.nextInt(0, limit + 1);
            if (!drawnNumbers.contains(drawned)) {
                drawnNumbers.add(drawned);
            }
        }
        return drawnNumbers;
    }
}