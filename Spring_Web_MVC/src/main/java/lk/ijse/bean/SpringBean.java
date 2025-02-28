package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, InitializingBean, ApplicationContextAware, DisposableBean {
    public SpringBean() {
        System.out.println("Spring bean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("bean factory aware setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("bean name aware setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application context aware setApplicationContext");
    }
}
