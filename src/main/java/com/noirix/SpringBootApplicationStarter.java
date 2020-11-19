package com.noirix;



import com.noirix.config.AmazonConfig;
import com.noirix.config.WebBeansConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.beans.BeansEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.noirix")
@EnableWebMvc
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Import({AmazonConfig.class, BeansEndpoint.ApplicationBeans.class, WebBeansConfig.class})
public class SpringBootApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationStarter.class, args);
    }
}