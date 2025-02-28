package lk.ijse.bean;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
    @Value("udara-san")
    private String name;

    public SpringBean() {
        System.out.println("spring bean constructor");
        System.out.println(name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }

    /* @Autowired(required = false)
    public SpringBean(@Value("udara-san") String name,@Value("1") int id,@Value("true") boolean status) {
        System.out.println(name);
        System.out.println(id);
    }

    @Autowired(required = false)
    public SpringBean(@Value("udara-san") String name,@Value("1") int id) {
        System.out.println(name);
        System.out.println(id);
    }*/
}
