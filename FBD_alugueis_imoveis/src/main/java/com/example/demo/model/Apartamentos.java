package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_imovel")
public class Apartamentos {


//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	
	
	
	@Id
	@GeneratedValue
	(generator = "tbimoveis_generation")
	@SequenceGenerator(
			name = "tbimoveis_generation",
			sequenceName = "tbimoveis_generration",
			initialValue = 0
			
			)
	private Long id;
	
	private Endereco endereco;
	
	private int numero;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
}
