package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //ensures that background task executor is created
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
