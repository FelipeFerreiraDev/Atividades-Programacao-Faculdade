package com.mycompany.progtrabalho;

import modelo.Buscador;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import modelo.Endereco;
import modelo.Motorista;
import modelo.Operador;
import util.Dao;

public class OperadorController {
    
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
    private TextField inputLogin;
    
    @FXML
    private TextField inputSenha;
    
    @FXML
    private TextField inputComplemento;
        
    private Buscador buscador;
    private Endereco endereco; 
    
    public OperadorController(){
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
    private void cadastrarOperador() {
        String nome = inputNome.getText();
        String login = inputLogin.getText();
        String senha = inputSenha.getText();
        
        
       Endereco endereco = new Endereco();
       endereco.setCep(inputCEP.getText());
       endereco.setLocalidade(inputCidade.getText());
       endereco.setLogradouro(inputLogradouro.getText());
       endereco.setUf(inputUF.getText());
        
       Operador o = new Operador(inputNome.getText(), endereco);
       o.setLogin(inputLogin.getText());
       o.setSenha(inputSenha.getText());
       Dao<Operador> dao = new Dao(Operador.class);
       dao.inserir(o);
        
       Alert alerta = new Alert(Alert.AlertType.INFORMATION);
       alerta.setHeaderText("Cadastrado confirmado");
       alerta.setContentText("Cadastro de operador confirmado");
       alerta.showAndWait();
       
       inputNome.setText("");
       inputLogin.setText("");
       inputSenha.setText("");
       
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