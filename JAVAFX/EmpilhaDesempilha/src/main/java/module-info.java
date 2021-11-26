module com.mycompany.empilhadesempilha {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.empilhadesempilha to javafx.fxml;
    exports com.mycompany.empilhadesempilha;
}
