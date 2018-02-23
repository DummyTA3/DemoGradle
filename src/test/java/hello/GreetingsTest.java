package hello;

import hello.Greetings;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingsTest {

    Greetings testG = new Greetings();

    @Test
    public void sayHello_noName_returnsNull() {
        String expected = "Hello null!";
        String actual = testG.sayHello(null);
        assertEquals(expected, actual);
    }

    @Test
    public void sayHello_johnGiven_returnsHelloJohn() {
        String expected = "Hello John!";
        String actual = testG.sayHello("John");
        assertEquals(expected, actual);
    }
}
