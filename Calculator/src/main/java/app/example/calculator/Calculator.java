package app.example.calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {
    @Override
    public void start(Stage stage) throws Exception {


        TextArea displayNumber = new TextArea();
        displayNumber.setPrefWidth(350);
        displayNumber.setPrefHeight(20);
        displayNumber.setPadding(new Insets(5));
        displayNumber.setEditable(false);


        VBox vbox = new VBox();

        //layout manager
        VBox root = new VBox(10,displayNumber);

        //create scene
        Scene scene = new Scene(root,400,500);


        //set scene
        stage.setScene(scene);

        //set title
        stage.setTitle("Calculator");

        //set show
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
