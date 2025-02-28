package com.example.demo.advisor;



import com.example.demo.util.ResponseUtill;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseUtill exceptionHandler(Exception ex){
        return  new ResponseUtill(500,ex.getMessage(),null
        );
    }
}
