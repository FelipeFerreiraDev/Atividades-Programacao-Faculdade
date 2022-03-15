package com.mycompany.progtrabalho;

import java.io.IOException;
import java.time.LocalDate;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import java.util.List;
import javafx.scene.control.DatePicker;
import modelo.Veiculo;
import modelo.Motorista;
import util.Dao;
import javafx.collections.FXCollections;
import javafx.scene.control.Alert;
import modelo.Operacao;

public class DevolucaoController {

    @FXML
    private ComboBox<Operacao> operacaoBox;
    
    private List<Operacao> operacao;
    private ObservableList<Operacao> listOperacao;
    
    @FXML
    private DatePicker pickerDataRetirada;
    
    @FXML
    private DatePicker pickerData;
    
    @FXML
    private void initialize() {
        Dao<Operacao> daoOperacao = new Dao(Operacao.class);
        
        operacao = daoOperacao.listarTodos();
        listOperacao = FXCollections.observableArrayList(operacao);
        operacaoBox.getItems().addAll(listOperacao);
        
        pickerData.setValue(LocalDate.now());
    }
    
    @FXML
    private void buscaData() {
        Operacao aux = operacaoBox.getValue();
        
        pickerDataRetirada.setValue(aux.getDataRetirada());
    }
    
    @FXML
    private void devolucao() {
        Operacao op = operacaoBox.getValue();
        
        Dao<Operacao> dao = new Dao(Operacao.class);
        op.setDataDevolucao(pickerData.getValue());
        dao.alterar(op);
        
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setHeaderText("");
        alerta.setContentText("Veículo devolvido com sucesso");
        alerta.showAndWait();
    }
    
     @FXML
    private void cancelar() throws IOException{
        App.setRoot("menu");
    }
}
