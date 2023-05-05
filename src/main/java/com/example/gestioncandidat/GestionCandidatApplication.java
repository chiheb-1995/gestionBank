package com.example.gestioncandidat;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.gestioncandidat.entity.Client;
import com.example.gestioncandidat.repositories.ClientRepositorie;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionCandidatApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionCandidatApplication.class, args);
	}
	@Bean
	ApplicationRunner start(ClientRepositorie repo)
	{ 
			return  args -> {
				Stream.of(new Client("Chiheb","Ben Rejeb"),
						new Client("Imen","Ouni"))
				.forEach(client -> 
					{
					repo.save(client);
					}					    );
				repo.findAll().forEach(s->System.out.println(s.getNom()));
			
	};
	
}

}
