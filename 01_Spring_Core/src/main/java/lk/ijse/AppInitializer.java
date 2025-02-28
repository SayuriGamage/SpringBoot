package lk.ijse;

import lk.ijse.bean.*;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
/*// eka ma object id eka repeat wenawa
        TestBean1 testBean1=context.getBean(TestBean1.class);
        System.out.println(testBean1);

        TestBean1 testBean2=context.getBean(TestBean1.class);
        System.out.println(testBean2);

        TestBean1 testBean3=context.getBean(TestBean1.class);
        System.out.println(testBean3);*/



        context.registerShutdownHook();




       /* MyConnection myConnection= (MyConnection) context.getBean("myConnection");
        System.out.println(myConnection);*/

       // MyConnection connection=context.getBean(MyConnection.class);
       // System.out.println(connection);
      /*  MyConnection myConnection= (MyConnection) context.getBean("bean2");
        System.out.println(myConnection);
        context.registerShutdownHook();*/
        //1st  latter is simple
        // springBean bean eke identification eka
        //by default name enna class eke name eka 1st latter eka simple karala
        //component eke component("bean")
      //  Object bean=context.getBean("bean");
      /*  Object bean = context.getBean("springBean");
        Object bean1 = context.getBean("testBean1");
        System.out.println(bean1);
        System.out.println(bean);
        TestBean1 testBean1 = (TestBean1) context.getBean("testBean1");
        System.out.println(testBean1);

        context.registerShutdownHook();*/
        /////////////////////////////

       /* //context eka athula object hadala daanawa(component annotation eka nisa)
        SpringBean springBean=context.getBean(SpringBean.class);
        springBean.sayHello();*/
       /* SpringBean testBean=context.getBean(SpringBean.class);
        System.out.println(testBean);
        TestBean1 testBean1=context.getBean(TestBean1.class);
        System.out.println(testBean1);
        TestBean2 testBean2=context.getBean(TestBean2.class);
        System.out.println(testBean2);

        Runtime.getRuntime().addShutdownHook(new Thread(){
            public void run() {
                System.out.println("shutting down");
                context.close();
            }
        });

        TestBean3 testBean3=context.getBean(TestBean3.class);
        System.out.println(testBean3);*/
    }
}
