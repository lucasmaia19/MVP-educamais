package com.example.mvpeducamaisspring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mvpeducamaisspring.model.Atividade;
import com.example.mvpeducamaisspring.repository.AtividadeRepository;

@RestController
@RequestMapping("atividade")
public class AtividadeController {
	
	@Autowired
	private AtividadeRepository repository;
	
	@GetMapping
	public List<Atividade> listaAtividade() {
		return repository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Atividade> listaUmaAtividade(@PathVariable Long id) { 
		return repository.findById(id);
	}
	
	@PostMapping
	public Atividade cadastrarAtividade(@RequestBody Atividade atividade) {
		return repository.save(atividade);
	}
	
	@DeleteMapping("/{id}") 
	public String deletarAtividade (@PathVariable Long id) { 
		repository.deleteById(id);
		return "O Game com Id: " + id + " Foi deletado com sucesso";
	}
	
	@PutMapping("/{id}")
	public Atividade atualizarCadastro(@RequestBody Atividade atividade, @PathVariable Long id) {
		
		Atividade atividadeSaved = repository.findById(id).get();

		BeanUtils.copyProperties(atividade, atividadeSaved, "id");

		return repository.save(atividadeSaved);
	}

}
