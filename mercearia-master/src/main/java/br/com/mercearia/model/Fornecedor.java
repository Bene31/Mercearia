package br.com.mercearia.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedor")
public class Fornecedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String codigo;
	
	@Column
	private String nome;
	
	@Column
	private String cnpj;
	
	@Column
	private String insc;
	
	@Column
	private String telefone;
	
	@Column
	private String fax;
	
	@Column
	private String cep;
	
	@Column
	private String endereco;
	
	@Column
	private String cidade;
	
	@Column
	private String uf;
	
	@Column
	private int numero;
	
	@Column
	private String bairro;
	
	@Column
	private String email;
	
	@OneToMany(mappedBy="fornecedor")
	private List<Produto> produtos;
	
	public Fornecedor() {		
	}
	
	public Fornecedor(String codigoEntrada, String nomeEntrada, String cnpjEntrada, String inscEntrada, String telefoneEntrada, String faxEntrada, String cepEntrada, String enderecoEntrada, String cidadeEntrada, String ufEntrada, int numeroEntrada, String bairroEntrada, String emailEntrada, List<Produto> produtos) {
		this.codigo = codigoEntrada;
		this.nome = nomeEntrada;
		this.cnpj = cnpjEntrada;
		this.insc = inscEntrada;
		this.telefone = telefoneEntrada;
		this.fax = faxEntrada;
		this.cep = cepEntrada;
		this.endereco = enderecoEntrada;
		this.cidade = cidadeEntrada;
		this.uf = ufEntrada;
		this.numero = numeroEntrada;
		this.bairro = bairroEntrada;
		this.email = emailEntrada;
		this.produtos = produtos;
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
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getInsc() {
		return insc;
	}

	public void setInsc(String insc) {
		this.insc = insc;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
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
	
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
	