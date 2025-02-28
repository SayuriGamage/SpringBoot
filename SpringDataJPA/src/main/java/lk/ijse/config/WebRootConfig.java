package lk.ijse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JPAConfig.class)
//data acess part eka config karanne root config eka athule
public class WebRootConfig {
}
