package springassignment1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Assignment1Config {
    @Bean
    public Student student() {
        return new Student(address(), 1234, "Billy");
    }
    @Bean public Phone phone(){
        return new Phone("1235556789");
    }
    @Bean public Address address() {
        return new Address("Manhattan", "New York", "United States", "10060");
    }
}
