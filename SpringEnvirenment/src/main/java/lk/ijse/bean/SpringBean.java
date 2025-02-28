package lk.ijse.bean;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean{
    @Value("${os.name}")
    private  String osName;
    @Value("${db.user}")
    private String dbUser;
@Value("${db.password}")
 private String dbPassword;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
        System.out.println(dbUser);
        System.out.println(dbPassword);
    }
}
