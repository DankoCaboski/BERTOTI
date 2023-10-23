package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
		for(int i = 0; i<10; i++){
			voos.add(new Voo());
		}
	}

	@GetMapping
	Iterable<Voo> getCoffees() {
		return voos;
	}

	@PostMapping
	ResponseEntity<String> createVoo() {
		Voo novoVoo = new Voo();
		voos.add(novoVoo);
		return new ResponseEntity<>("Novo voo criado com sucesso", HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	ResponseEntity<Voo> getVooById(@PathVariable int id) {
		if (id >= 0 && id < voos.size()) {
			Voo voo = voos.get(id);
			return new ResponseEntity<>(voo, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	ResponseEntity<String> deleteVooById(@PathVariable int id) {
		if (id >= 0 && id < voos.size()) {
			voos.remove(id);
			return new ResponseEntity<>("Voo removido com sucesso", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Voo não encontrado", HttpStatus.NOT_FOUND);
		}
	}
}
