package lk.ijse.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    @Autowired
    Agreement girl;


    public void chatWithGirl(){
       girl.chat();
    }
}
