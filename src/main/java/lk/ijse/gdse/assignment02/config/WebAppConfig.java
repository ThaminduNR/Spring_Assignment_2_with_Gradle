package lk.ijse.gdse.assignment02.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*
 * Author  : Thamindu Ranawaka
 * Date    : 9/21/2023
 * Project : Assignment-2-Gradle
 */
@Configuration
@EnableWebMvc
public class WebAppConfig {
    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
