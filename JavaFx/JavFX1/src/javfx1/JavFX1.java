// Write a javafx application to demonstrate the 
package javfx1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavFX1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label nameLabel = new Label("name");

        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name!");

        Button submitButton = new Button("Submit");
        Button clearButton = new Button("Clear");

        submitButton.setOnAction((e) -> {
            System.out.println("Submit button is clicked");
            System.out.println(nameField.getText());
             Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Submit button clicked");
            alert.setContentText(nameField.getText());
            alert.showAndWait();
        });
        
        clearButton.setOnAction((e) -> {
            System.out.println("Clear button is clicked");
            nameField.setText("");
           
        });
        HBox hBox1 = new HBox(10);
        hBox1.getChildren().addAll(nameLabel, nameField);

        HBox hBox2 = new HBox(10);
        hBox2.getChildren().addAll(submitButton, clearButton);

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(hBox1, hBox2);

        Scene scene = new Scene(vBox, 400, 500);

        stage.setScene(scene);
        stage.setTitle("Demo");
        stage.show();

    }

}
