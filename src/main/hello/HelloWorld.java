package main.hello;

import org.joda.time.LocalTime;

public class HelloWorld {

    public static void main(String [] args) {

        Greetings g = new Greetings();
        System.out.println(g.sayHello("cs2102 class"));

        LocalTime timeNow = new LocalTime();
        System.out.println("Time now is: " + timeNow);
        
    }
}
