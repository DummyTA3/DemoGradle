package test.hello;

import main.hello.Greetings;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingsTest {

    Greetings testG = new Greetings();

    @Test
    public void sayHello_noName_returnsHello() {
        String expected = "Hello !";
        String actual = testG.sayHello(null);
        assertEquals(expected, actual);
    }
}
