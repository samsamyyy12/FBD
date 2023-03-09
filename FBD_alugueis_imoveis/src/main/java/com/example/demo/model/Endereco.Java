package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_endereco")
public class Endereco {


//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)	

	
	@Id
	@GeneratedValue
	(generator = "tbendereco_generation")
	@SequenceGenerator(
			name = "tbendereco_generation",
			sequenceName = "tbendereco_generration",
			initialValue = 0
			
			)
      
	private Long id;
  	private String rua;	
	private String cep;
	private int numero;
  	private String Logradouro;
	
	
}
