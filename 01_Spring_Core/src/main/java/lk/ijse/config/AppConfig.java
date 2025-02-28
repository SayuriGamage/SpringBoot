package lk.ijse.config;

import lk.ijse.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
//multiple packages dennath puluwan
//@ComponentScan("","")
public class AppConfig {
 /*   public AppConfig() {
        System.out.println("app config constructor");

    }*/
  /*  @Bean("bean2")
    public MyConnection myConnection(){
        return new MyConnection();
    }*/
    @Bean
    public MyConnection myConnection() {
        return new MyConnection();
    }
}
