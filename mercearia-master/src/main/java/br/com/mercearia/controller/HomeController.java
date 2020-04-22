package br.com.mercearia.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.mercearia.dao.ProdutoDao;
import br.com.mercearia.model.Produto;


@ViewScoped
@Named(value="homeController")
public class HomeController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String texto = "Mercearia Paiva";
	
    private ProdutoDao produtoDao = new ProdutoDao();
    
    @PostConstruct
    public void init() throws Exception {
    	/*Produto produto = new Produto();
    	produto.setCodigo("123");
    	produtoDao.inserirProduto(produto);
    	*/
    	
    	produtoDao.recuperarTodosProdutos();
    } 

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}	

}
