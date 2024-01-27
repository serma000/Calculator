package app.example.calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {
    //text field to display text
    TextArea displayNumber = new TextArea();
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
    Button decimal = new Button(".");

    //Button for mathematics operation
    Button addition = new Button("+");
    Button subtraction = new Button("-");
    Button multiplication = new Button("*");
    Button division = new Button("/");
    Button percentage = new Button("%");

    //Extra button
    Button equalTo = new Button("=");
    Button delete = new Button("Del");
    Button allClear = new Button("AC");

    double num1 ,num2, result;
    String operator;
    @Override
    public void start(Stage stage) throws Exception {

        //editing text field
        displayNumber.setPrefWidth(300);
        displayNumber.setPrefHeight(40);
        displayNumber.setPadding(new Insets(5,5,5,5));
        displayNumber.setEditable(false);

        // numbers button array
        Button[] numButtons = new Button[]{button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,decimal};
        // setting the button sizes and font size for number buttons
        for (Button s : numButtons) {
            s.setPrefSize(70, 60);
            s.fontProperty().set(Font.font(30));
        }
        //operator button array
        Button[] operatorButton = new Button[]{addition,subtraction,multiplication,division,percentage};
        //setting the  button size and font size of the operator button
        for(Button b:operatorButton){
            b.setPrefSize(70,65);
            b.fontProperty().set(Font.font(25));
        }
        delete.setPrefSize(70,65);
        allClear.setPrefSize(70,65);
        equalTo.setPrefSize(70,65);
        delete.fontProperty().set(Font.font(25));
        allClear.fontProperty().set(Font.font(25));
        equalTo.fontProperty().set(Font.font(25));

        //for displaying numbers in the textField
        for (Button n: numButtons){
            n.setOnAction(actionEvent -> {
                //getting the initial value and concatenating the current value of n and the setting it on displayNumber
                //displayNumber.setText(displayNumber.getText().concat(n.getText()));
                displayNumber.setText(n.getText());

            });
        }
        /*for displaying operators in the textField
        for (Button o: operatorButton){
            o.setOnAction(actionEvent -> {
                //getting the initial value and concatenating the current value of o and the setting it on displayNumber
                displayNumber.getText().concat(o.getText());
            });
        }*/
        addition.setOnAction(actionEvent -> {
            num1 = Double.parseDouble(displayNumber.getText());
            operator="+";

        });
        subtraction.setOnAction(actionEvent -> {
            num1 = Double.parseDouble(displayNumber.getText());
            operator="-";
        });
        multiplication.setOnAction(actionEvent -> {
            num1 = Double.parseDouble(displayNumber.getText());
            operator="*";
        });
        division.setOnAction(actionEvent -> {
            num1 = Double.parseDouble(displayNumber.getText());
            operator="/";
        });
        percentage.setOnAction(actionEvent -> {
            num1 = Double.parseDouble(displayNumber.getText());
            operator="%";
        });
        equalTo.setOnAction(actionEvent -> {
            num2 = Double.parseDouble(displayNumber.getText());
            /*if(addition.getText().equals("+")){
                result=num1+num2;
            }*/
            switch (operator){
                case "+":
                    result=num1+num2;
                    break;
                case"-":
                    result=num1-num2;
                    break;
                case"*":
                    result=num1*num2;
                    break;
                case"/":
                    result=num1/num2;
                    break;
            }
            num1=result;
            displayNumber.setText(String.valueOf(num1));

        });

        //gridPane
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
        Scene scene = new Scene(root,320,450);
        //set scene
        stage.setScene(scene);
        //set title
        stage.setTitle("Calculator App");
        stage.setResizable(false);
        //set show
        stage.show();

    }


}
