package br.com.ds.listavip.app;

import br.com.ds.listavip.controllers.ConvidadosController;
import br.com.ds.listavip.controllers.HomeController;
import br.com.ds.listavip.models.Convidado;
import br.com.ds.listavip.repository.ConvidadoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackageClasses = {ConvidadosController.class, HomeController.class})
@EntityScan(basePackageClasses = {Convidado.class})
@EnableJpaRepositories(basePackageClasses = {ConvidadoRepository.class})
public class AppConfig {

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }

}

