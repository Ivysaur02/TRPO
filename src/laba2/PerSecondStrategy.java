package laba2;

public class PerSecondStrategy implements BillingStrategy {
    private final double costPerSecond;

    public PerSecondStrategy(double costPerSecond) {
        this.costPerSecond = costPerSecond;
    }

    @Override
    public double calculateCost(int numberOfCalls, int totalDuration) {
        return totalDuration * costPerSecond;
    }


    @Override
    public String toString(){
        return "PerSecondStrategy";
    }
}
