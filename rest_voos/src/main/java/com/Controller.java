package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Controller {

	public static void main(String[] args) {
		SpringApplication.run(Controller.class, args);
	}

}

@RestController
@RequestMapping("/voos")
@CrossOrigin(origins = "*")
class Rotas {
	private List<Voo> voos = new ArrayList<>();

	public Rotas() {
		voos.add(new Voo());
	}

	@GetMapping
	Iterable<Voo> getCoffees() {
		return voos;
	}
}