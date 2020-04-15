package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.stream.Stream;


public class Controller {

    @FXML //you have to call this otherwise it will call java.awt! that's wrong
public TextField firstName;
    //public TextField firstName = new TextField(); //This is for lambda I guess...

    public void handleSaysup(ActionEvent actionEvent) {
         System.out.println("Sup! " + firstName.getText());

        /*
        // I have tried to write it in lambda but it doesnt work!
        firstName.setOnAction(actionEvent1 -> System.out.println("Sup " + firstName.getText()));
        firstName.getOnAction();

         */

    }
}
