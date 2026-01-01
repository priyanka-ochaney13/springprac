package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(com.example.config.Appconfig.class); 
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student st = context.getBean(Student.class);
        st.setAge(20);
        System.out.println(st.getAge());
        st.code();

        // Desktop desktop = context.getBean("desk1", Desktop.class);
        // System.out.println("obj1 created");

        // Desktop desktop2 = context.getBean("desk1", Desktop.class);
        // System.out.println("obj2 created");

        
    }
}
