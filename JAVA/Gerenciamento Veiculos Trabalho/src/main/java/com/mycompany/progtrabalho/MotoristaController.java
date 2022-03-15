package com.mycompany.progtrabalho;

import modelo.Buscador;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import modelo.Endereco;
import modelo.Motorista;
import util.Dao;

public class MotoristaController {
    
    @FXML
    private TextField inputCEP;
    
    @FXML
    private TextField inputLogradouro;
    
    @FXML
    private TextField inputCidade; 
    
    @FXML
    private TextField inputUF;
    
    @FXML
    private TextField inputBairro;
    
    @FXML
    private TextField inputNome;
    
    @FXML
    private TextField inputCnh;
    
    @FXML
    private TextField inputSecao;
    
    @FXML
    private TextField inputComplemento;
        
    private Buscador buscador;
    private Endereco endereco; 
    
    public MotoristaController(){
        buscador = new Buscador();
    }
    
    @FXML
    private void buscar() {
        String cep = inputCEP.getText();
        try {
            endereco = buscador.buscar(cep);
            inputCidade.setText(endereco.getLocalidade());
            inputUF.setText(endereco.getUf());
            inputBairro.setText(endereco.getBairro());
            inputLogradouro.setText(endereco.getLogradouro());
            inputComplemento.setText(endereco.getComplemento());
        } catch (IOException ex) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("");
            alerta.setContentText(ex.getMessage());
            alerta.showAndWait(); 
        }
        catch(Exception e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("");
            alerta.setContentText(e.getMessage());
            alerta.showAndWait(); 
        }
    }
    
    @FXML
    private void cadastrarMotorista() {
        String nome = inputNome.getText();
        String cnh = inputCnh.getText();
        String secao = inputSecao.getText();
        
        
       Endereco endereco = new Endereco();
       endereco.setCep(inputCEP.getText());
       endereco.setLocalidade(inputCidade.getText());
       endereco.setLogradouro(inputLogradouro.getText());
       endereco.setUf(inputUF.getText());
        
       Motorista m = new Motorista(inputNome.getText(), endereco);
       m.setCnh(inputCnh.getText());
       m.setSecao(inputSecao.getText());
       Dao<Motorista> dao = new Dao(Motorista.class);
       dao.inserir(m);
        
       Alert alerta = new Alert(Alert.AlertType.INFORMATION);
       alerta.setHeaderText("Cadastrado confirmado");
       alerta.setContentText("Cadastro de motorista confirmado");
       alerta.showAndWait();
       
       inputNome.setText("");
       inputCnh.setText("");
       inputSecao.setText("");
       
       inputCEP.setText("");
       inputUF.setText("");
       inputCidade.setText("");
       inputBairro.setText("");
       inputLogradouro.setText("");
       inputComplemento.setText("");
    }
    
    @FXML
    private void cancelar() throws IOException{
        App.setRoot("menu");
    }
}