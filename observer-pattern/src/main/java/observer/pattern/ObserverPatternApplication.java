package observer.pattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackageClasses = ObserverPatternApplication.class)
public class ObserverPatternApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ObserverPatternApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
