package com.mycompany.progtrabalho;

import java.io.IOException;
import javafx.fxml.FXML;

public class MenuController {

    @FXML
    private void switchToCreateUserView() throws IOException {
        App.setRoot("createMotorista");
    }
    
    @FXML
    private void switchToCarView() throws IOException {
        App.setRoot("car");
    }
    
    @FXML
    private void switchToOperadorView() throws IOException {
        App.setRoot("createOperador");
    }
    
    @FXML
    private void switchToListarView() throws IOException {
        App.setRoot("listar");
    }
    
    @FXML
    private void switchToDevolverView() throws IOException {
        App.setRoot("devolucao");
    }
    
    @FXML
    private void switchToListCarsView() throws IOException {
        App.setRoot("listaCarros");
    }
    
    @FXML
    private void cancelar() throws IOException{
        App.setRoot("primary");
    }
}