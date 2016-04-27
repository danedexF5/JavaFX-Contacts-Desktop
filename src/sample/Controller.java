package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    ListView<Contact> list;

    @FXML
    TextField addName;

    @FXML
    TextField addPhone;

    @FXML
    TextField addEmail;

    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    public void toAdd() {
        contacts.add(new Contact(addName.getText(), addPhone.getText(), addEmail.getText()));
        addName.setText("");
        addPhone.setText("");
        addEmail.setText("");
    }

        public void toRemove() {
            contacts.remove(list.getSelectionModel().getSelectedItem());
        }
        public void blankField() {
            if ((addName.getText() == ("")) || addPhone.getText() == ("") || addEmail.getText() == ("")) {
                System.out.println("Cannot Add");


            }
        }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);
    }
}