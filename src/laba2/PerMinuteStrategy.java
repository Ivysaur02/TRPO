package laba2;

public class PerMinuteStrategy implements BillingStrategy {
    private final double costPerMinute;

    public PerMinuteStrategy(double costPerMinute) {
        this.costPerMinute = costPerMinute;
    }

    @Override
    public double calculateCost(int numberOfCalls, int totalDuration) {
        int totalMinutes = (int) Math.ceil(totalDuration / 60.0);
        return totalMinutes * costPerMinute;
    }

    @Override
    public String toString(){
        return "PerMinuteStrategy";
    }
}

