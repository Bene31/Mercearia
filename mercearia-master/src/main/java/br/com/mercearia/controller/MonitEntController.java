package br.com.mercearia.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.mercearia.dao.PedidoDao;
import br.com.mercearia.dao.MonitEntDao;
import br.com.mercearia.model.Pedido;
import br.com.mercearia.model.MonitEnt;
import br.com.mercearia.dao.FornecedorDao;
import br.com.mercearia.model.Fornecedor;

@ViewScoped
@Named(value="monitEntController")
public class MonitEntController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private MonitEntDao monitEntDao = new MonitEntDao();
	private PedidoDao pedidoDao = new PedidoDao();
    private MonitEnt monitEnt = new MonitEnt();
    private List<MonitEnt> monitEnts = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();
    private Pedido pedidoSelecionado = new Pedido();
    private Long pedidoId = 1L;
    private FornecedorDao fornecedorDao = new FornecedorDao();
    private List<Fornecedor> fornecedores = new ArrayList<>();
    private Fornecedor fornecedorSelecionado = new Fornecedor();
    private Long fornecedorId = 1L;
      	
	public void salvarMonitEnt() throws Exception {
		monitEntDao.inserirMonitEnt(monitEnt);
	}
	
	public List<MonitEnt> listarMonitEnts() throws Exception {
		monitEnts = monitEntDao.recuperarTodosMonitEnts();
		return monitEnts;
	}
	
	public List<Pedido> pedidosDisponiveis() {
		pedidos = pedidoDao.recuperarTodosPedido();
		return pedidos;
	}
	
	public List<Fornecedor> fornecedoresDisponiveis(){
		fornecedores = fornecedorDao.recuperarTodosFornecedores();
		return fornecedores;
	}
		
	public MonitEnt getMonitEnt() {
			return monitEnt;
	}

	public void setMonitEnt(MonitEnt monitEnt) {
		this.monitEnt = monitEnt;
	}

	public List<MonitEnt> getMonitEnts() {
		return monitEnts;
	}

	public void setMonitEnt(List<MonitEnt> monitEnts) {
		this.monitEnts = monitEnts;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Pedido getPedidoSelecionado() {
		return pedidoSelecionado;
	}

	public void setPedidoSelecionado(Pedido pedidoSelecionado) {
		this.pedidoSelecionado = pedidoSelecionado;
	}

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}
	
	public List<Fornecedor> getFornecedores(){
		return fornecedores;
	}
	
	public void serFornecedores(List<Fornecedor> fornecedores){
		this.fornecedores = fornecedores;
	}
	
	public Fornecedor getFornecedorSelecionado() {
		return fornecedorSelecionado;
	}

	public void setFornecedorSelecionado(Fornecedor fornecedorSelecionado) {
		this.fornecedorSelecionado = fornecedorSelecionado;
	}
	
	public Long getFornecedorId() {
		return fornecedorId;
	}

	public void setFornecedorId(Long fornecedorId) {
		this.fornecedorId = fornecedorId;
	}
	
}
