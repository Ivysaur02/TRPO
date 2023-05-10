package laba1.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NumberTest {

    private double value;
    private double expectedValue;

    public NumberTest(double value, double expectedValue) {
        this.value = value;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                { 0.0, 0.0 },
                { 1, 1 },
                { 1.0, 1.0 },
                { -1.0, -1.0 },
                { -10.0, -10.0 },
                { Double.MAX_VALUE, Double.MAX_VALUE },
                { Double.MIN_VALUE, Double.MIN_VALUE }
        });
    }

    @Test
    public void testEvaluate() {
        laba1.Number num = new laba1.Number(value);
        assertEquals(expectedValue, num.evaluate(), 0.0);
    }

    @Test
    public void testGetValue() {
        laba1.Number num = new laba1.Number(value);
        assertEquals(expectedValue, num.getValue(), 0.0);
    }

    @Test
    public void testToString() {
        laba1.Number num = new laba1.Number(value);
        assertEquals(String.valueOf(expectedValue), num.toString());
    }
}