package br.com.mercearia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String codigo;
	
	@Column
	private String nome;
	
	@Column
	private String telefone1;
	
	@Column
	private String telefone2;
	
	@Column
	private String cep;
	
	@Column
	private String endereco;
	
	@Column
	private String cidade;
	
	@Column
	private String bairro;
	
	@Column
	private String complemento;
	
	@Column
	private int numero;
	
	@Column
	private String email;
	
	@Column
	private float saldo;
	
	
	public Cliente() {		
	}
	
	public Cliente(String codigoEntrada, String nomeEntrada, String telefone1Entrada, String telefone2Entrada, String cepEntrada, String enderecoEntrada, String cidadeEntrada, String bairroEntrada, String complementoEntrada, int numeroEntrada, String emailEntrada, float saldoEntrada) {
		this.codigo = codigoEntrada;
		this.nome = nomeEntrada;
		this.telefone1 = telefone1Entrada;
		this.telefone2 = telefone2Entrada;
		this.cep = cepEntrada;
		this.endereco = enderecoEntrada;
		this.cidade = cidadeEntrada;
		this.bairro = bairroEntrada;
		this.complemento = complementoEntrada;
		this.numero = numeroEntrada;
		this.email = emailEntrada;
		this.saldo = saldoEntrada;
	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	
	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
	