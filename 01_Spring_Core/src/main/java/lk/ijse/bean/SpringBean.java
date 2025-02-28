package lk.ijse.bean;


import org.springframework.stereotype.Component;

@Component("bean")
public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean constructor");
    }

    public  void sayHello(){
        System.out.println("Hello Spring Bean");
    }
}
