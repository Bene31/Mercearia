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
@Table(name = "monitEnt")
public class MonitEnt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	

	@ManyToOne
	@JoinColumn(name = "Pedido")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "Fornecedor")
	private Fornecedor fornecedor;
	
	public MonitEnt() {		
	}
	
	public MonitEnt(Pedido pedido, Fornecedor fornecedor) {
		this.pedido = pedido;
		this.fornecedor = fornecedor;
	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public Fornecedor getFornecedor(){
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor){
		this.fornecedor = fornecedor;
	}
	
}
	