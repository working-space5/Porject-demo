package school.School;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);
    }
@Bean
    CommandLineRunner run(StudentOperations operations){
    return args -> {
        operations.updateStudentsAge(1);
    };

    }

}



