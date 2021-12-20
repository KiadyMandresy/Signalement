
package com.projet.signalement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Personne;


@SpringBootApplication
@RestController
public class DemoAppli {

    
    public static void main(String[] args) {
    SpringApplication.run(DemoAppli.class, args);
    }
    
    @GetMapping("/hello")
    public String hello() {
        String name = "kiady";
        Personne p = new Personne(name);
        return String.format("Hello %s!", p.getNom());
    }

}
