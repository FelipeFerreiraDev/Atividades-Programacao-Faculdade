package com.mycompany.progtrabalho;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import modelo.Veiculo;
import util.Dao;

public class CarController {
    
    @FXML
    private TextField inputMarca;
    
    @FXML
    private TextField inputModelo;
    
    @FXML
    private TextField inputPlaca;
    
    @FXML
    private TextField inputCor;
    
    
    @FXML
    private void createCar() throws IOException {
                
        Veiculo v = new Veiculo(inputMarca.getText(), inputModelo.getText(), inputPlaca.getText(), inputCor.getText());
        Dao<Veiculo> dao = new Dao<> (Veiculo.class);
        
        dao.inserir(v);
        
        inputMarca.clear(); 
        inputModelo.clear();
        inputPlaca.clear();
        inputCor.clear();
    }
    
    @FXML
    private void cancelar() throws IOException{
        App.setRoot("menu");
    }
}
