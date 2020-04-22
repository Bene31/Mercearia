package br.com.mercearia.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.mercearia.dao.MonitSaiDao;
import br.com.mercearia.dao.ProdutoDao;
import br.com.mercearia.model.MonitSai;
//import br.com.mercearia.model.Pedido;
import br.com.mercearia.model.Produto;

@ViewScoped
@Named(value="monitSaiController")

public class MonitSaiController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private ProdutoDao produtoDao = new ProdutoDao();
	private MonitSaiDao monitSaiDao = new MonitSaiDao();
	private MonitSai monitSai = new MonitSai();
    private List<Produto> produtos = new ArrayList<>();
    private List<MonitSai> monitSais = new ArrayList<>();
    private Produto produtoSelecionado = new Produto();
    private Long produtoId = 1L;

    public void salvarMonitSai() throws Exception {
		monitSaiDao.inserirMonitSai(monitSai);
	}
	
	public List<MonitSai> listarMonitSais() throws Exception {
		monitSais = monitSaiDao.recuperarTodosMonitSais();
		return monitSais;
	}
	
	public List<Produto> produtosDisponiveis() {
		produtos = produtoDao.recuperarTodosProdutos();
		return produtos;
	}
		
	public MonitSai getMonitSai() {
			return monitSai;
	}

	public void setMonitSai(MonitSai monitSai) {
		this.monitSai = monitSai;
	}

	public List<MonitSai> getMonitSais() {
		return monitSais;
	}

	public void setMonitSai(List<MonitSai> monitSais) {
		this.monitSais = monitSais;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	public Long getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Long produtoId) {
		this.produtoId = produtoId;
	}
	
	
	
}