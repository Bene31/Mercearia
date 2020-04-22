package br.com.mercearia.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.mercearia.dao.CaixaDao;
import br.com.mercearia.dao.ProdutoDao;
import br.com.mercearia.model.Caixa;
import br.com.mercearia.model.Produto;

@ViewScoped
@Named(value="caixaController")
public class CaixaController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private CaixaDao caixaDao = new CaixaDao();
	private ProdutoDao produtoDao = new ProdutoDao();
    private Caixa caixa = new Caixa();
    private List<Caixa> caixas = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    private Produto produtoSelecionado = new Produto();
    private Long produtoId = 1L;
      	
	public void salvarCaixa() throws Exception {
		caixaDao.inserirCaixa(caixa);
	}
	
	public List<Caixa> listarCaixas() throws Exception {
		caixas = caixaDao.recuperarTodosCaixas();
		return caixas;
	}
	
	public List<Produto> produtosDisponiveis() {
		produtos = produtoDao.recuperarTodosProdutos();
		return produtos;
	}
		
	public Caixa getCaixa() {
			return caixa;
	}

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}

	public List<Caixa> getCaixas() {
		return caixas;
	}

	public void setCaixas(List<Caixa> caixas) {
		this.caixas = caixas;
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
