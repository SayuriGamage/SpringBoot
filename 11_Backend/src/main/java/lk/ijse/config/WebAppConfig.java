package lk.ijse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages ={ "lk.ijse","lk.ijse.controller"})
public class WebAppConfig implements WebMvcConfigurer {
   /* @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowCredentials(true).allowedMethods("GET", "POST", "PUT", "DELETE")
        .allowedHeaders("*").maxAge(3600);
    }*/

    // addMapping("/api/v1/customer/save")
    //allowOrigins("http://test.example.com")
    //* mark eka deno nm all request gannawa
}
