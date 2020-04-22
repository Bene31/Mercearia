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
@Table(name = "monitSai")
public class MonitSai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String dataVenda;
	
	@Column
	private float preco;
	
	@ManyToOne
	@JoinColumn(name = "Produto")
	private Produto produto;
	
	
	public MonitSai() {		
	}
	
	public MonitSai(String dataVenda, float preco, Produto produto) {
		this.dataVenda = dataVenda;
		this.preco = preco;
		this.produto = produto;
	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDataVenda(){
		return dataVenda;
	}
	
	public void setDataVenda(String dataVenda){
		this.dataVenda = dataVenda;
	}
	
	public float getPreco(){
		return preco;
	}
	
	public void setPreco(float preco){
		this.preco = preco;
	}

	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}
	