package com.example.config;
import com.example.Desktop;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class Appconfig {
    @Bean (name={"com1", "desk1"}) // multiple names for a single bean but now if we want to call this bean by desktop then it will give error 
    public Desktop desktop() {
        return new Desktop();
    }
}
