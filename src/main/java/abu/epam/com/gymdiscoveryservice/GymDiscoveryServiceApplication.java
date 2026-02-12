package abu.epam.com.gymdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GymDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GymDiscoveryServiceApplication.class, args);
    }

}
