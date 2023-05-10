package laba1.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class VarTest {

    private String name;
    private String expectedValue;

    public VarTest(String name, String expectedValue) {
        this.name = name;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {"var", "var"},
                {"123", "123"},
        });
    }

    @Test
    public void getNameTest() {
        laba1.Variable var = new laba1.Variable(name);
        assertEquals(expectedValue, var.getName());
    }
}
