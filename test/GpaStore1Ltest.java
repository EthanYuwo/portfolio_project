import org.junit.Test;

import components.gpaStore.GPAStore;
import components.gpaStore.GPAStore1L;

/**
 * unfinished gpaStore1Ltest.
 */
public class GpaStore1Ltest {
    @Test
    public void emptyTest() {
        GPAStore<Double> g = new GPAStore1L<Double>();
    }

    @Test
    public void addTest() {
        GPAStore<Double> g = new GPAStore1L<Double>();
        final double x = 3.4;
        g.add(x);
    }

}
