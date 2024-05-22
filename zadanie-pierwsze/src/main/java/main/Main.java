package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.Test;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

            SpringApplication.run(Main.class, args);

            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

            Test test = (Test) context.getBean("test");
            test.run();
        }

}
