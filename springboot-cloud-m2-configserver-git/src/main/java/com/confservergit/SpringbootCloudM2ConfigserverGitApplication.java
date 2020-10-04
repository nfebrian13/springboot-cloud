package com.confservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringbootCloudM2ConfigserverGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudM2ConfigserverGitApplication.class, args);
	} 

}
