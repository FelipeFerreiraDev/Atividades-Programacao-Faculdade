package com.mycompany.progtrabalho;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import modelo.Operacao;
import modelo.Veiculo;
import util.Dao;

public class ListaCarrosController implements Initializable{
    ObservableList lista=FXCollections.observableArrayList();
    
    @FXML
    private ListView<Operacao> listView;
    
    private List<Operacao> operacao;
    
    @FXML
    private void busca() throws IOException {
        listView.getItems().clear();
        
        Dao<Operacao> daoOperacao = new Dao(Operacao.class);
        
        lista.addAll(daoOperacao.listarTodos());
        listView.setItems(lista);
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        listView.setItems(lista);
    }
    
    @FXML
    private void cancelar() throws IOException{
        App.setRoot("menu");
    }
}
