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

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@RestController
public class ControllerUsuario {

	@Autowired
	private UsuarioRepository usuarioRepository;

//	
//	@GetMapping("/usuario")
//	public Page<Usuario> getUsuario (Pageable pageable){
//		return usuarioRepository.findAll(pageable);
//				
//	}

	@GetMapping("/getUsuario")
	public List<Usuario> getUsuario() {
		return usuarioRepository.findAll();

	}

	@PostMapping("/saveUsuario")
	public Usuario saveUsuario(@RequestBody Endereco endereco) {
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
