package com.example.cardapio.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permite que qualquer origem acesse os recursos
        registry.addMapping("/**") // Aplica CORS para todos os endpoints
                .allowedOrigins("http://localhost:5173") // Permite o frontend local na porta 3000
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos permitidos
                .allowedHeaders("*") // Permite todos os cabeçalhos
                .allowCredentials(true); // Permite credenciais (como cookies ou cabeçalhos de autorização)
    }
}

