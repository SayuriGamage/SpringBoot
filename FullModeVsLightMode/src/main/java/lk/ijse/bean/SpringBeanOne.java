package lk.ijse.bean;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

@Component
public class SpringBeanOne {
    @Bean
    public SpringBeanTwo springBeanTwo(){
        SpringBeanThree springBeanThree=springBeanThree();
        SpringBeanThree springBeanThree1=springBeanThree();
        System.out.println(springBeanThree);
        System.out.println(springBeanThree1);
        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree springBeanThree(){
        return  new SpringBeanThree();
    }

}
