package com.example.config;
import com.example.Desktop;
import com.example.Student;
import com.example.Computer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@Configuration
public class Appconfig {
    @Bean (name={"com1", "desk1"}) // multiple names for a single bean but now if we want to call this bean by desktop then it will give error 
    @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }
    @Bean
    public Student student(@Autowired Computer computer) {
        Student student = new Student();
        student.setComputer(computer); 
        return student;
    }
    // @Bean
    // public Computer computer() {
    //     return new Desktop(); 
    //     // returning Desktop object as Computer type bwecause Desktop implements Computer interface and thus we can return Desktop object as Computer type
    //     // this is called polymorphism
    //     //what if we have another class Laptop which also implements Computer interface
    //     // we can create another bean method which returns Laptop object as Computer type example below
    //     // public Computer computer2() {
    //     //     return new Laptop();
    //     // }
    // }

} 
