package io.getarays.server;

import io.getarays.server.enumaration.Status;
import io.getarays.server.model.Server;
import io.getarays.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
	@Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.162", "Ubuntu Linux", "32 GB", "Personal Pc", "http://localhost:8080/server/image/s1.jpg", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.16", "Ubuntu Flora", "16 GB", "Web Server", "http://localhost:8080/server/image/s2.jpg", Status.SERVER_DOWN));
			serverRepo.save(new Server(null, "192.168.1.169", "Linux", "8 GB", "Mail Server", "http://localhost:8080/server/image/s3.jpg", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.15", "Red Hat", "64 GB", "Dell tower", "http://localhost:8080/server/image/s4.jpg", Status.SERVER_DOWN));

		};

	}

}
