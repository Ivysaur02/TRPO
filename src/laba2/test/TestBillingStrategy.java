package laba2.test;

import laba2.BillingStrategy;
import laba2.PhoneBilling;
import laba2.SubscriptionFeeStrategy;
import laba2.PerMinuteStrategy;
import laba2.PerSecondStrategy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBillingStrategy {

    PhoneBilling phoneBilling;

    @Before
    public void init() {
        phoneBilling = new PhoneBilling(new SubscriptionFeeStrategy(15.00));
    }

    @Test
    public void TestToChangePhoneBillingStrategyToMin() {
        phoneBilling.setBillingStrategy(new PerMinuteStrategy(15));
        assertEquals(phoneBilling.toString(), "PerMinuteStrategy");
    }

    @Test
    public void TestToChangePhoneBillingStrategyToSec() {
        phoneBilling.setBillingStrategy(new PerSecondStrategy(15));
        assertEquals(phoneBilling.toString(), "PerSecondStrategy");
    }

    @Test
    public void AddCall() {
        phoneBilling.addCall(15);
        assertEquals(phoneBilling.getNumberOfCalls(), 1);
    }

    @Test
    public void EvalueteNonChangeStr() {
        phoneBilling.addCall(15);
        assertEquals(phoneBilling.getTotalDuration(), 15);
    }

}
