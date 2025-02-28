package lk.ijse;

import lk.ijse.bean.TestBean;
import lk.ijse.bean.TestBean2;
import lk.ijse.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
       context.register(AppConfig.class);
       context.refresh();

        TestBean testBean = (TestBean) context.getBean(TestBean.class);
        System.out.println(testBean);

        TestBean2 testBean2 = (TestBean2) context.getBean(TestBean2.class);
        System.out.println(testBean2);
       context.close();
    }
}
