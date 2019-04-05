package com.moviera;

import com.moviera.model.Movie;
import com.moviera.repository.MovieRepository;
import com.moviera.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieraApplication implements CommandLineRunner
{

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MovieRepository repository;

	@Autowired
	private UserRepository uRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		uRepository.saveUserWithProfile();
	}
}
