package io.github.natanaelqneves;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MyConfig {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("PERFIL DE DESENVOLVIMENTO ATIVADO!");
        };
    }
}
