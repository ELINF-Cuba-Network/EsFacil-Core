package cu.vlired.esFacilCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("cu.vlired.esFacilCore.repository")
public class SubmodApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubmodApplication.class, args);
    }

}
