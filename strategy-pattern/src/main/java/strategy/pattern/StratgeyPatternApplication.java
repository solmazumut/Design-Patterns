package strategy.pattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import strategy.pattern.domain.impl.*;

import java.util.ArrayList;


@SpringBootApplication
public class StratgeyPatternApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StratgeyPatternApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        ducks.add(new ReadheadDuck());
        ducks.add(new RubberDuck());
        ducks.add(new DecoyDuck());

        //we can call the display function of different type ducks with one line of code
        for (Duck duck: ducks) {
            duck.display();
        }
    }
}
