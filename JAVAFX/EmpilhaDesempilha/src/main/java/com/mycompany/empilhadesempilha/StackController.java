package com.mycompany.empilhadesempilha;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class StackController implements Initializable{
    ObservableList lista=FXCollections.observableArrayList();
    Pilha pi = new Pilha(11);
    int ult = pi.retornaTopo();
    int i = -1;
    
    

    @FXML
    private TextField fieldInsertValue;
    
    @FXML
    private Button stackButton;
    
    @FXML
    private ListView<String> returnListView;
    
    @FXML
    private Button unstackbutton;
    
    @FXML
    private void insertValue() throws IOException {
        if(i<10) {
            No n = new No(fieldInsertValue.getText());
            pi.empilha(n);
            ult= pi.retornaTopo();
            lista.add(pi.imprime(ult));
            returnListView.setItems(lista);
            i++;
            fieldInsertValue.clear();
            fieldInsertValue.requestFocus();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("A pilha está cheia");
            alert.setContentText("Se a pilha não estiver cheia execute novamente a operação, ou reinicie a aplicação");
            alert.show();
            fieldInsertValue.clear();
        }
    }
    
    @FXML
    private void removeValue() throws IOException, ExcecaoPilhaVazia {
       try {
            pi.desempilha();
            lista.removeAll();
            lista.clear();
            ult= pi.retornaTopo();
            for(int i=0; i<=ult; i++) {
                if(pi.imprime(i) != null) {
                 lista.addAll(pi.imprime(i));
                }
            }
            returnListView.setItems(lista);
            i--;
       }catch(Exception e) {
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setTitle("Erro");
           alert.setHeaderText("A pilha pode estar vazia");
           alert.setContentText("Se a pilha não estiver vazia execute novamente a operação, ou reinicie a aplicação");
           alert.show();
       }

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        returnListView.setItems(lista);
    }
}
