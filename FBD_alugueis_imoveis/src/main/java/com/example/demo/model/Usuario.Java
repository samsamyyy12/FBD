package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_usuario")
public class Usuario {


//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)	

	
	@Id
	@GeneratedValue
	(generator = "tbusuario_generation")
	@SequenceGenerator(
			name = "tbusuario_generation",
			sequenceName = "tbusuario_generration",
			initialValue = 0
			
			)
      
	  private Long id;
    private Endereco endereco;
  	private String cpf;	
	  private String nome;
	  private String login;
  	private String senha;
    private String cnpj;	
	
	
}
