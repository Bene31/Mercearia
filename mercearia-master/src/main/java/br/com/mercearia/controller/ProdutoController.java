package br.com.mercearia.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.mercearia.dao.FornecedorDao;
import br.com.mercearia.dao.ProdutoDao;
import br.com.mercearia.model.Fornecedor;
import br.com.mercearia.model.Produto;

@ViewScoped
@Named(value="produtoController")
public class ProdutoController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private ProdutoDao produtoDao = new ProdutoDao();
	private FornecedorDao fornecedorDao = new FornecedorDao();
    private Produto produto = new Produto();
    private List<Produto> produtos = new ArrayList<>();
    private List<Fornecedor> fornecedores = new ArrayList<>();
    private Fornecedor fornecedorSelecionado = new Fornecedor();
    private Long fornecedorId = 1L;
      	
	public void salvarProduto() throws Exception {
		produtoDao.inserirProduto(produto);
	}
	
	public List<Produto> listarProdutos() throws Exception {
		produtos = produtoDao.recuperarTodosProdutos();
		return produtos;
	}
	
	public List<Fornecedor> fornecedoresDisponiveis() {
		fornecedores = fornecedorDao.recuperarTodosFornecedores();
		return fornecedores;
	}
		
	public Produto getProduto() {
			return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
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
