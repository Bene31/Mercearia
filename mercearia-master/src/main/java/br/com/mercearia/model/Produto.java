package br.com.mercearia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String codigo;
	
	@Column
	private String descricao;
	
	@Column
	private String marca;
	
	@Column
	private String tipo;
	
	@Column
	private int quantidade;
	
	@Column
	private float valorCompra;
	
	@Column
	private float valorVenda;
	
	@Column
	private String dataFab;
	
	@Column 
	private String dataVen;
	
	@ManyToOne
	@JoinColumn(name = "fornecedor")
	private Fornecedor fornecedor;
	
	public Produto() {		
	}
	
	public Produto(String codigoEntrada, String descricaoEntrada, String marcaEntrada, String tipoEntrada, int quantidadeEntrada, float valorCompraEntrada, float valorVendaEntrada, String dataFabEntrada, String dataVenEntrada, Fornecedor fornecedor) {
		this.codigo = codigoEntrada;
		this.descricao = descricaoEntrada;
		this.marca = marcaEntrada;
		this.tipo = tipoEntrada;
		this.quantidade = quantidadeEntrada;
		this.valorCompra = valorCompraEntrada; 
		this.valorVenda = valorVendaEntrada; 
		this.dataFab = dataFabEntrada; 
		this.dataVen = dataVenEntrada;
		this.fornecedor = fornecedor;
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
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	public String getDataFab() {
		return dataFab;
	}

	public void setDataFab(String dataFab) {
		this.dataFab = dataFab;
	}
	
	public String getDataVen() {
		return dataVen;
	}

	public void setDataVen(String dataVen) {
		this.dataVen = dataVen;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
	