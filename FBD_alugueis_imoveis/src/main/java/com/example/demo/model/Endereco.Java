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
	public Endereco(Long id, String rua, String cep, int numero, String logradouro) {
		super();
		this.id = id;
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
		Logradouro = logradouro;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getLogradouro() {
		return Logradouro;
	}
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	
	
}
