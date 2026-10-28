package com.example.project.config;
import org.springframework.beans.factory.annotation.Value;import org.springframework.context.annotation.*;import org.springframework.web.servlet.config.annotation.*;import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration public class WebConfig {
 @Value("${app.cors.allowed-origins:http://127.0.0.1:5500,http://localhost:5500}") private String origins;
 @Bean public WebMvcConfigurer cors(){return new WebMvcConfigurer(){public void addCorsMappings(CorsRegistry r){r.addMapping("/api/**").allowedOrigins(origins.split(",")).allowedMethods("GET","POST","PUT","DELETE","OPTIONS").allowedHeaders("*");}};}
 @Bean public PasswordEncoder passwordEncoder(){return new BCryptPasswordEncoder();}
}