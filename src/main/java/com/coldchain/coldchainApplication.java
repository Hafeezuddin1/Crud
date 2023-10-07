package com.coldchain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@ComponentScan("com.coldchain.*")
public class coldchainApplication extends SpringBootServletInitializer{
//@Override
//protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//    return application.sources(coldchainApplication.class);
//}

public static void main(String[] args) throws Exception {
    SpringApplication.run(coldchainApplication.class, args);
}
}
