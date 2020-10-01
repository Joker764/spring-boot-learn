package com.hachi.jpa;

import com.hachi.jpa.dao.BaseRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = BaseRepository.class)
public class SpringBootJpa {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpa.class, args);
	}

}
