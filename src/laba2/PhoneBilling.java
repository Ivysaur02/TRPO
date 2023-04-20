package laba2;

public class PhoneBilling {
    private BillingStrategy billingStrategy;
    private int numberOfCalls;
    private int totalDuration;

    public PhoneBilling(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public void addCall(int duration) {
        numberOfCalls++;
        totalDuration += duration;
    }

    public double getTotalCost() {
        return billingStrategy.calculateCost(numberOfCalls, totalDuration);
    }
}
