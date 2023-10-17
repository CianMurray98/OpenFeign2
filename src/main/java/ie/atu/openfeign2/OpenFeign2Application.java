package ie.atu.openfeign2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenFeign2Application {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeign2Application.class, args);
    }

}
