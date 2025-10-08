package com.productprices.service;

import java.util.List;

import com.productprices.model.Produto;

public interface IProdutoService {
    void adicionarProduto(Produto produto);
    void removerProduto(Produto produto);
    List<Produto> listarProdutos();
}
