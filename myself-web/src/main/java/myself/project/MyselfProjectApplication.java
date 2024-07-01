package myself.project;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author aiiiiii
 */
@SpringBootApplication
@AllArgsConstructor
@Slf4j
public class MyselfProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyselfProjectApplication.class, args);
    }

}
