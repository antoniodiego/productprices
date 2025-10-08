package com.productprices.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import com.productprices.controller.GuiaProdutosController;
import java.io.IO;

/**
 * Controlador principal (da Scene principal) da aplicação.
 * Responsável por gerenciar a interface principal e interações do usuário.
 */

public class MainController {
    @FXML
    private GuiaProdutosController guiaProdutosController;

    public void handleCadastraProduto() {
        IO.println("Cadastrar Produto acionado");
        // Lógica para abrir a janela de cadastro de produto
    }
}
