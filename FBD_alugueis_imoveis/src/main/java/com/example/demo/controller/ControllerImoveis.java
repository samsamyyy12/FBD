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

import com.example.demo.model.Apartamentos;
import com.example.demo.repository.ApartamentosRepository;

@RestController
public class ControllerImoveis {

	@Autowired
	private ApartamentosRepository apartamentosRepository;

//	
//	@GetMapping("/apartamentos")
//	public Page<Apartamentos> getImoveis(Pageable pageable){
//		return apartamentosRepository.findAll(pageable);
//				
//	}

	@GetMapping("/getApartamentos")
	public List<Apartamentos> getImoveis() {
		return apartamentosRepository.findAll();

	}

	@PostMapping("/saveApartamentos")
	public Apartamentos saveApartamento(@RequestBody Apartamentos apartamentos) {
		return apartamentosRepository.save(apartamentos);

	}

	@DeleteMapping("/deletartudo")
	public void deleteAp() {
		apartamentosRepository.deleteAll();

	}

	@GetMapping("/apartamento/{id}")
	public Apartamentos exbibiApartamento(@RequestBody Long id) {
		return apartamentosRepository.getReferenceById(id);

	}

	@GetMapping("/apartamentoByid/{id}")
	public Apartamentos getEmployeebyId(@PathVariable(value = "id") Long apartamentoId) {
		Apartamentos apartamento = apartamentosRepository.findById(apartamentoId).get();

		return apartamento;
	}

	@PutMapping("/updateapartamento/{id}")
	public ResponseEntity<Apartamentos> updateEmployee(@PathVariable(value = "id") Long Id,
			@RequestBody Apartamentos employeeDetails) {
		Apartamentos apartamento = apartamentosRepository.findById(Id).get();

		apartamento.setEndereco(employeeDetails.getEndereco());
		apartamento.setNumero(employeeDetails.getNumero());
		final Apartamentos updatedApartamento = apartamentosRepository.save(apartamento);
		return ResponseEntity.ok(updatedApartamento);
	}

}
