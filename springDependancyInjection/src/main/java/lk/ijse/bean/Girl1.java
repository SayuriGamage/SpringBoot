package lk.ijse.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl1 implements Aggrement {

    public Girl1()  {
        System.out.println("girl constructor");
    }


    @Override
    public void chat() {
        System.out.println("girl 1 chat");
    }
}
