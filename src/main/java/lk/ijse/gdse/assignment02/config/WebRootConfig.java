package lk.ijse.gdse.assignment02.config;

import lk.ijse.gdse.assignment02.AppInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*
 * Author  : Thamindu Ranawaka
 * Date    : 9/21/2023
 * Project : Assignment-2-Gradle
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = AppInitializer.class)
public class WebRootConfig {
}
