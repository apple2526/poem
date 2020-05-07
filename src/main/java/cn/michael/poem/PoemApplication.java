package cn.michael.poem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("cn.michael.poem.pojo")
public class PoemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoemApplication.class, args);
    }

}
