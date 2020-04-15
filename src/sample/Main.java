package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

      /*  Group root = new Group();
        Text text = new Text("Sup?");
        text.setFont(new Font("Papyrus",80));
        Label label = new Label("Name:");
        TextField nameField = new TextField();
        GridPane grid = new GridPane();
        Button btn = new Button();
        grid.add(label,0,0);
        grid.add(nameField,1,0);
        grid.add(btn,1,1);
        grid.setHgap(20);
        //grid.setGridLinesVisible(true);
        btn.setText("Say Sup");
        btn.setOnAction(evt -> System.out.printf("Sup %s! %n",nameField.getText()));
        text.setY(50);
        VBox box = new VBox();
        box.getChildren().addAll(text,grid);
        root.getChildren().add(box);

       */
        primaryStage.setTitle("Sup");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
