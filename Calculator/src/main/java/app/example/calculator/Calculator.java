package app.example.calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
<<<<<<< HEAD
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
=======
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
>>>>>>> origin/main
import javafx.stage.Stage;

public class Calculator extends Application {
    @Override
    public void start(Stage stage) throws Exception {


        TextArea displayNumber = new TextArea();
<<<<<<< HEAD
        displayNumber.setPrefWidth(300);
        displayNumber.setPrefHeight(40);
        displayNumber.setPadding(new Insets(5,5,5,5));
        displayNumber.setEditable(false);

        //button for numbers
        Button button0 = new Button("0");
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");

        button0.setPrefSize(70,60);
        button1.setPrefSize(70,60);
        button2.setPrefSize(70,60);
        button3.setPrefSize(70,60);
        button4.setPrefSize(70,60);
        button5.setPrefSize(70,60);
        button6.setPrefSize(70,60);
        button7.setPrefSize(70,60);
        button8.setPrefSize(70,60);
        button9.setPrefSize(70,60);

        button0.fontProperty().set(Font.font(30));
        button1.fontProperty().set(Font.font(30));
        button2.fontProperty().set(Font.font(30));
        button3.fontProperty().set(Font.font(30));
        button4.fontProperty().set(Font.font(30));
        button5.fontProperty().set(Font.font(30));
        button6.fontProperty().set(Font.font(30));
        button7.fontProperty().set(Font.font(30));
        button8.fontProperty().set(Font.font(30));
        button9.fontProperty().set(Font.font(30));


        //Button for mathematics operation
        Button addition = new Button("+");
        Button subtraction = new Button("-");
        Button multiplication = new Button("*");
        Button division = new Button("/");
        Button percentage = new Button("%");
        Button equalTo = new Button("=");

        //sizing
        addition.setPrefSize(70,65);
        subtraction.setPrefSize(70,65);
        multiplication.setPrefSize(70,65);
        division.setPrefSize(70,65);
        percentage.setPrefSize(70,65);
        equalTo.setPrefSize(70,65);

        //Extra button
        Button decimal = new Button(".");
        Button delete = new Button("Del");
        Button allClear = new Button("AC");

        //customize size of buttons
        decimal.setPrefSize(70,65);
        delete.setPrefSize(70,65);
        allClear.setPrefSize(70,65);

        //customize font size of the button words
        addition.fontProperty().set(Font.font(25));
        subtraction.fontProperty().set(Font.font(25));
        multiplication.fontProperty().set(Font.font(25));
        division.fontProperty().set(Font.font(25));
        percentage.fontProperty().set(Font.font(25));
        equalTo.fontProperty().set(Font.font(25));
        decimal.fontProperty().set(Font.font(25));
        delete.fontProperty().set(Font.font(25));
        allClear.fontProperty().set(Font.font(25));




        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //adding button in grid pane
        gridPane.add(percentage, 0, 0);
        gridPane.add(division, 1, 0);
        gridPane.add(delete, 2, 0);
        gridPane.add(allClear, 3, 0);

        gridPane.add(button9, 0, 1);
        gridPane.add(button8, 1, 1);
        gridPane.add(button7, 2, 1);
        gridPane.add(multiplication, 3, 1);

        gridPane.add(button6, 0, 2);
        gridPane.add(button5, 1, 2);
        gridPane.add(button4, 2, 2);
        gridPane.add(subtraction, 3, 2);

        gridPane.add(button3, 0, 3);
        gridPane.add(button2, 1, 3);
        gridPane.add(button1, 2, 3);
        gridPane.add(addition, 3, 3);

        gridPane.add(button0, 0, 4,2,1);
        gridPane.add(decimal, 2, 4);
        gridPane.add(equalTo, 3, 4);

        //layout manager
        VBox root = new VBox(10, displayNumber, gridPane);
        //create scene
        Scene scene = new Scene(root, 320, 450);
=======
        displayNumber.setPrefWidth(350);
        displayNumber.setPrefHeight(20);
        displayNumber.setPadding(new Insets(5));
        displayNumber.setEditable(false);


        VBox vbox = new VBox();

        //layout manager
        VBox root = new VBox(10,displayNumber);

        //create scene
        Scene scene = new Scene(root,400,500);
>>>>>>> origin/main


        //set scene
        stage.setScene(scene);
<<<<<<< HEAD
        //set title
        stage.setTitle("Calculator App");
        //set show
        stage.show();
=======

        //set title
        stage.setTitle("Calculator");

        //set show
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
>>>>>>> origin/main
    }
}
