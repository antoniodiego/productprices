package com.productprices.service;

import java.util.ArrayList;
import java.util.List;
import com.productprices.model.Produto;

public class ProdutoService implements IProdutoService {
    private List<Produto> produtos;

    public ProdutoService() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }   

    @Override
    public List<Produto> listarProdutos() {
        return produtos;
    }
}
