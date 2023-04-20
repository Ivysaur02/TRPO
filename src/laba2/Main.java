package laba2;

public class Main {
    public static void main(String[] args) {
        PhoneBilling phoneBilling = new PhoneBilling(new SubscriptionFeeStrategy(15.00));

        phoneBilling.addCall(120);
        phoneBilling.addCall(45);
        System.out.println("Total cost with subscription fee: " + phoneBilling.getTotalCost());

        phoneBilling.setBillingStrategy(new PerSecondStrategy(0.01));
        System.out.println("Total cost with per-second billing: " + phoneBilling.getTotalCost());

        phoneBilling.setBillingStrategy(new PerMinuteStrategy(0.5));
        System.out.println("Total cost with per-minute billing: " + phoneBilling.getTotalCost());
    }
}
