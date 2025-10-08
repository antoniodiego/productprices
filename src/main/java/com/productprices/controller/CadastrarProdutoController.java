package com.productprices.controller;

import com.productprices.model.Produto;

import javafx.fxml.FXML;

import javafx.scene.control.Alert;

public class CadastrarProdutoController  implements javafx.fxml.Initializable {

    @FXML
    private javafx.scene.control.TextField txtNome;

    @FXML
    private javafx.scene.control.TextField txtPreco;

    @FXML
    private javafx.scene.control.TextField txtQuantidade;

    @FXML
    private javafx.scene.control.Button btnCadastrar;

    @FXML
    private javafx.scene.control.Button btnLimpar;

    CadastrarProdutoController() {
    }
    
    @Override
    public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    }

    @FXML
    void cadastrarProduto() {
        String nome = txtNome.getText();
        String precoStr = txtPreco.getText();
        String quantidadeStr = txtQuantidade.getText();

        if (nome.isEmpty() || precoStr.isEmpty() || quantidadeStr.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Erro", "Todos os campos devem ser preenchidos.");
            return;
        }

        double preco;
        int quantidade;
        try {
            preco = Double.parseDouble(precoStr);
            quantidade = Integer.parseInt(quantidadeStr);
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Erro", "Preço e Quantidade devem ser numéricos.");
            return;
        }

        Produto produto = new Produto(nome, preco, quantidade);
        // Aqui você pode adicionar o produto a uma lista ou banco de dados

        showAlert(Alert.AlertType.INFORMATION, "Sucesso", "Produto cadastrado com sucesso!");

        limparCampos();
    }

    @FXML
    void limparCampos() {
        txtNome.clear();
        txtPreco.clear();
        txtQuantidade.clear();
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}