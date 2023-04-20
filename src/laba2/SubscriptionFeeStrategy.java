package laba2;

public class SubscriptionFeeStrategy implements BillingStrategy {
    private final double subscriptionFee;

    public SubscriptionFeeStrategy(double subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    @Override
    public double calculateCost(int numberOfCalls, int totalDuration) {
        return subscriptionFee;
    }
}

