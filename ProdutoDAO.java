package br.com.sistemacomercial.dao;

import java.util. ArrayList;
import java.util.List;
import br.com.sistemacomercial.model.Produto;

public class ProdutoDAO {
	private List<Produto> listarProdutros = new ArrayList<>();
	
	public void adicionarProduto(Produto produto) {
		listarProdutros.add(produto);
	}

	public List<Produto> listarProdutos(){
		return listarProdutros;
	}
}
