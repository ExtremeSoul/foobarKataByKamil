import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooBarTest {

    @Test
    public void shouldReturnZeroWhenZeroGiven() {
        FooBar fooBar = new FooBar();
        String result = fooBar.convert(0);

        assertEquals("0", result);
    }

    @Test
    public void shouldReturnFooWhenThreeGiven() {
        FooBar fooBar = new FooBar();
        String result = fooBar.convert(3);

        assertEquals("Foo", result);
    }

    @Test
    public void shouldReturnFooWhenNineGiven() {
        FooBar fooBar = new FooBar();
        String result = fooBar.convert(9);

        assertEquals("Foo", result);
    }

    @Test
    public void shouldReturnBarWhenFiveGiven() {
        FooBar fooBar = new FooBar();
        String result = fooBar.convert(5);

        assertEquals("Bar", result);
    }

    @Test
    public void shouldReturnBarWhenTenGiven() {
        FooBar fooBar = new FooBar();
        String result = fooBar.convert(10);

        assertEquals("Bar", result);
    }

    @Test
    public void shouldReturnFooBarWhenFifteenGiven() {
        FooBar fooBar = new FooBar();
        String result = fooBar.convert(15);

        assertEquals("FooBar", result);
    }

    @Test
    public void shouldReturnSeventeenWhenSeventeenGiven() {
        FooBar fooBar = new FooBar();
        String result = fooBar.convert(17);

        assertEquals("17", result);
    }


}
