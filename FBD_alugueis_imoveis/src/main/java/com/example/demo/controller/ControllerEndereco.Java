package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Endereco;
import com.example.demo.repository.EnderecoRepository;

@RestController
public class ControllerEndereco {

	@Autowired
	private EnderecoRepository enderecoRepository;

//	
//	@GetMapping("/endereco")
//	public Page<Endereco> getEndereco (Pageable pageable){
//		return enderecoRepository.findAll(pageable);
//				
//	}

	@GetMapping("/getEndereco")
	public List<Endereco> getEndereco() {
		return enderecoRepository.findAll();

	}

	@PostMapping("/saveEndereco")
	public Enderecos saveEndereco(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);

	}

	@DeleteMapping("/deletartudo")
	public void deleteAp() {
		enderecoRepository.deleteAll();

	}

	@GetMapping("/endereco/{id}")
	public Endereco exbibiEndereco(@RequestBody Long id) {
		return enderecoRepository.getReferenceById(id);

	}

	@GetMapping("/enderecoByid/{id}")
	public Endereco getEnderecobyId(@PathVariable(value = "id") Long Id) {
		Endereco endereco = enderecoRepository.findById(Id).get();

		return endereco;
	}

	@PutMapping("/updateendereco/{id}")
	public ResponseEntity<Endereco> updateEndereco(@PathVariable(value = "id") Long Id,
			@RequestBody Endereco enderecoDetails) {
		Endereco endereco = enderecoRepository.findById(Id).get();

		endereco.setEndereco(employeeDetails.getEndereco());
		endereco.setNumero(employeeDetails.getNumero());
		final Endereco updatedEndereco = enderecoRepository.save(endereco);
		return ResponseEntity.ok(updatedEndereco);
	}

}
