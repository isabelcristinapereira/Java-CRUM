package com.example.colaborador.Controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.colaborador.Colaborador.service.Service;
import com.example.colaborador.Repository.ColaboradorRepository;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {
	@Autowired
	private Service colaboradorService;
	
	@GetMapping("/{cpf_colaborador}")
	public ResponseEntity<Service>buscarColaboradorPeloCpf (@PathVariable(value="cpf_colaborador")String colaborador) {
		
		return ResponseEntity.status(200).body(colaboradorService.buscarColaboradorPeloCpf(cpf).get());
		
	}

	
	@PostMapping("/cadastrar")
	public ResponseEntity<Object> cadastrarColaborador(@Valid @RequestBody Service novoColaborador) {
		Optional<Object> objetoCadastrado = colaboradorService.salvarColaborador(novoColaborador);

		if (objetoCadastrado.isPresent()) {
			return ResponseEntity.status(201).body(objetoCadastrado.get());
		} else {
			return ResponseEntity.status(400).build();
		}

	}
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable long id) {
		repository.deleteById(id);
		
	}
	
	
	
}
