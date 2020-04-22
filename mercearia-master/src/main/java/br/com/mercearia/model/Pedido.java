package br.com.mercearia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String codigo;
	
	@Column
	private String descricao;
	
	@Column
	private int quantidade;
	
	@Column
	private String tipo;
	
	@Column
	private String marca;
	
	public Pedido() {		
	}
	
	public Pedido(String codigoEntrada, String descricaoEntrada, int quantidadeEntrada, String tipoEntrada, String marcaEntrada) {
		this.codigo = codigoEntrada;
		this.descricao = descricaoEntrada;
		this.quantidade = quantidadeEntrada;
		this.tipo = tipoEntrada;
		this.marca = marcaEntrada;
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
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
	