package com.mycompany.progtrabalho;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import util.DaoOperador;
import modelo.Operador;

public class PrimaryController {

    @FXML
    private TextField inputUser;
    
    @FXML
    private TextField inputPassword;
    
    @FXML void login() throws IOException {
//        DaoOperador daoOperador = new DaoOperador();
//        String login  = inputUser.getText();
//        String password = inputPassword.getText();
//        Operador op = new Operador(login, password);
//        
//        boolean autenticar = daoOperador.autenticar(op);
//        
//        if(autenticar) {
//            System.out.println("PASSOU AQ");
            App.setRoot("menu");
//        } else {
//            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
//            alerta.setHeaderText("Não foi possivel logar");
//            alerta.setContentText("Usuário ou senha incorretos");
//            alerta.showAndWait();
//        }
    }
}