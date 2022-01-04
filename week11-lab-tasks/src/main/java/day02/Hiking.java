package day02;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Double> heights) {
        validateList(heights);
        double count = 0;
        for (int i = 1; i < heights.size(); i++) {
            if (heights.get(i) > heights.get(i - 1)) {
                count += heights.get(i) - heights.get(i - 1);
            }
        }
        return count;
    }

    private void validateList(List<Double> heights) {
        if (heights.size() == 0) {
            throw new IllegalArgumentException("List can't be empty!");
        }
        if (heights == null) {
            throw new NullPointerException("List is null.");
        }
    }
}