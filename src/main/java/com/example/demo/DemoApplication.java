package com.example.demo;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

//		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		CityRepository repository = context.getBean(CityRepository.class);

		// crud
		// C Create
//		repository.save(new City("Minks"));
//		repository.save(new City("Moscow"));
//		repository.save(new City("Piter"));
//		repository.save(new City("LA"));

		// R Read
//		System.out.println(repository.findAll());

		// U Update
//		System.out.println(repository.findAll());
//		repository.save(new City(4, "Los Angeles"));
//		System.out.println(repository.findAll());

		// D Delete
//		System.out.println(repository.findAll());
//		repository.deleteById(2);
//		repository.delete(new City(4));
//		System.out.println(repository.findAll());
	}
}
