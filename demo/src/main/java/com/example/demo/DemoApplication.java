package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@Entity
@Table(name = "person_data")
class Person {
	
	@Id
	private Long id;
	private String first_name;
	private String last_name;
	
	public String getFullName() {
		return first_name+ " "+last_name;
	}
}

@Service
 class PersonService {
	
	private final PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository=personRepository;
	}
	
 public	List<Person> findAll() {
		return personRepository.findAll();
	}
}

@Repository
interface PersonRepository extends JpaRepository<Person, Long> {
	
}


@RestController
@RequestMapping("/person/")
class PersonController {
	
	@Autowired
	private final PersonService personService;
	
	public PersonController(PersonService personService) {
		this.personService=personService;
	}
	@GetMapping("/getAll")
	public List<Person> findAll() {
		return personService.findAll();
		
	}
}

