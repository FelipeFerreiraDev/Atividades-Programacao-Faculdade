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

public class ListarController {

    @FXML
    private ComboBox<Veiculo> veiculoBox;
    
    private List<Veiculo> veiculos;
    private ObservableList<Veiculo> listVeiculos;
    
    @FXML
    private ComboBox<Motorista> motoristaBox;
    
    private List<Motorista> motoristas;
    private ObservableList<Motorista> listarMotoristas;
    
    @FXML
    private DatePicker pickerData;
    
    @FXML
    private void initialize() {
        Dao<Veiculo> daoVeiculo = new Dao(Veiculo.class);
        Dao<Motorista> daoMotorista = new Dao(Motorista.class);
        
        veiculos = daoVeiculo.listarTodos();
        listVeiculos = FXCollections.observableArrayList(veiculos);
        veiculoBox.getItems().addAll(listVeiculos);
        veiculoBox.setValue(listVeiculos.get(0));
        
        motoristas = daoMotorista.listarTodos();
        listarMotoristas = FXCollections.observableArrayList(motoristas);
        motoristaBox.getItems().addAll(listarMotoristas);
        motoristaBox.setValue(listarMotoristas.get(0));
        
        pickerData.setValue(LocalDate.now());
    }
    
     @FXML
    private void retiradaVeiculo() throws IOException{
        Operacao operacao = new Operacao();
        operacao.setVeiculo(veiculoBox.getValue());
        operacao.setMotorista(motoristaBox.getValue());
        operacao.setDataRetirada(pickerData.getValue());
        Dao<Operacao> dao = new Dao(Operacao.class);
        dao.inserir(operacao);
        
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setHeaderText("");
        alerta.setContentText("Retirada de veículo registrada com sucesso");
        alerta.showAndWait();
    }
    
    @FXML
    private void cancelar() throws IOException{
        App.setRoot("menu");
    }
}
