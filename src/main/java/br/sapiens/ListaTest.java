package br.sapiens;

import br.sapiens.modelo.Pessoa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListaTest {
    @FXML
    private TableView table;

    @FXML
    private Button windson;
    @FXML
    public void initialize() {
        table.setEditable(true);

        TableColumn nomeCol = new TableColumn("First Name");
        nomeCol.setMinWidth(100);
        nomeCol.setCellValueFactory(
                new PropertyValueFactory<Pessoa, String>("nome"));


        TableColumn sobreNomeCol = new TableColumn("Last Name");
        sobreNomeCol.setMinWidth(100);
        sobreNomeCol.setCellValueFactory(
                new PropertyValueFactory<Pessoa, String>("sobreNome"));


        TableColumn emailCol = new TableColumn("Email");
        emailCol.setMinWidth(100);
        emailCol.setCellValueFactory(
                new PropertyValueFactory<Pessoa, String>("email"));

        table.setItems(data);
        table.getColumns().addAll(nomeCol,sobreNomeCol,emailCol);
        table.setEditable(false);
    }

    final ObservableList<Pessoa> data = FXCollections.observableArrayList(
            new Pessoa("Jacob", "Smith", "jacob.smith@example.com"),
            new Pessoa("Isabella", "Johnson", "isabella.johnson@example.com"),
            new Pessoa("Ethan", "Williams", "ethan.williams@example.com"),
            new Pessoa("Emma", "Jones", "emma.jones@example.com"),
            new Pessoa("Michael", "Brown", "michael.brown@example.com")
    );

    public void acaoBotao(){
        for (Pessoa pessoa : data){
            System.out.println(pessoa);
        }
    }



}
