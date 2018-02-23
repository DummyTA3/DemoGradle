package hello;

/**
 * Contains various greeting (hello!) messages
 */
public class Greetings {

    /**
     * Says hello to the person passed as argument
     * @param name of the person
     * @return Hello {Name}
     */
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }

    /**
     * Says good morning to the person passed as argument
     * @param name of the person
     * @return Good morning {Name}
     */
    public String goodMorning(String name) {
        return "Good morning " + name + "!!";
    }
}
