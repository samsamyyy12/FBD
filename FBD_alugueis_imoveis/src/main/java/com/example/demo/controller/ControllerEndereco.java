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

//	package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Endereco;
import com.example.demo.repository.EnderecoRepository;

@RestController
@RequestMapping("enderecos")
public class ControllerEndereco {

	@Autowired
	private EnderecoRepository enderecoRepository;

	
	@GetMapping("/endereco")
	public Page<Endereco> getEndereco (Pageable pageable){
		return enderecoRepository.findAll(pageable);
				
	}
	
	@GetMapping("/get-all-enderecos")
	public List<Endereco> getAllEmployee(){
		List<Endereco> allEnderecolist = enderecoRepository.findAll();
		return allEnderecolist;
		
	}

	@PostMapping("/saveEndereco")
	public Endereco saveEndereco(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);

	}
	
	  @PostMapping("/create-endereco")
	    public Endereco createEmployee(@RequestBody Endereco endereco) {
	       
	    	 Endereco savedEndereco = enderecoRepository.save(endereco);
	    	 
	    	 return savedEndereco;
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

		endereco.setRua(enderecoDetails.getRua());
		endereco.setNumero(enderecoDetails.getNumero());
		endereco.setLogradouro(enderecoDetails.getLogradouro());
		endereco.setCep(enderecoDetails.getCep());
		final Endereco updatedEndereco = enderecoRepository.save(endereco);
		return ResponseEntity.ok(updatedEndereco);
	}

}
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

		endereco.setRua(enderecoDetails.getRua());
		endereco.setNumero(enderecoDetails.getNumero());
		endereco.setLogradouro(enderecoDetails.getLogradouro());
		endereco.setCep(enderecoDetails.getCep());
		final Endereco updatedEndereco = enderecoRepository.save(endereco);
		return ResponseEntity.ok(updatedEndereco);
	}

}
