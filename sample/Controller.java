package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
    double fNum, sNum;
    String operator = null;
    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button divide;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button multiply;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button minus;

    @FXML
    private Button zero;

    @FXML
    private Button clear;

    @FXML
    private Button equals;

    @FXML
    private Button plus;

    @FXML
    private TextField display;

    @FXML
    private Button decimal;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if(event.getSource() == zero){
            String oldVal = display.getText();
            String set = "0";
            display.setText(oldVal + set);
        }
        else if (event.getSource() == one) {
            String oldVal = display.getText();
            String set = "1";
            display.setText(oldVal + set);
        } else if (event.getSource() == two) {
            String oldVal = display.getText();
            String set = "2";
            display.setText(oldVal + set);
        } else if (event.getSource() == three) {
            String oldVal = display.getText();
            String set = "3";
            display.setText(oldVal + set);
        } else if (event.getSource() == four) {
            String oldVal = display.getText();
            String set = "4";
            display.setText(oldVal + set);
        } else if (event.getSource() == five) {
            String oldVal = display.getText();
            String set = "5";
            display.setText(oldVal + set);
        } else if (event.getSource() == six) {
            String oldVal = display.getText();
            String set = "6";
            display.setText(oldVal + set);
        } else if (event.getSource() == seven) {
            String oldVal = display.getText();
            String set = "7";
            display.setText(oldVal + set);
        } else if (event.getSource() == eight) {
            String oldVal = display.getText();
            String set = "8";
            display.setText(oldVal + set);
        } else if (event.getSource() == nine) {
            String oldVal = display.getText();
            String set = "9";
            display.setText(oldVal + set);
        }
            else if(event.getSource() == decimal){
                String oldVal = display.getText();
                String set = ".";
                display.setText(oldVal + set);
            }
        else if (event.getSource() == clear) {
            display.setText("");
        } else if (event.getSource() == plus) {
            String value = display.getText();
            double number = Double.parseDouble(value);
            fNum = number;
            display.setText("");
            operator = "+";

        } else if (event.getSource() == minus) {
            String value = display.getText();
            double number = Double.parseDouble(value);
            fNum = number;
            display.setText("");
            operator = "-";
        } else if (event.getSource() == multiply) {
            String value = display.getText();
            double number = Double.parseDouble(value);
            fNum = number;
            display.setText("");
            operator = "*";
        } else if (event.getSource() == divide) {
            String value = display.getText();
            double number = Double.parseDouble(value);
            fNum = number;
            display.setText("");
            operator = "/";
        } else if (event.getSource() == equals) {
            switch (operator) {
                case "+":
                    String value = display.getText();
                    sNum = Double.parseDouble(value);
                    double result = this.fNum + this.sNum;
                    display.setText(String.valueOf(result));
                    break;
                case "-":
                    value = display.getText();
                   sNum = Double.parseDouble(value);
                    result = this.fNum - this.sNum;
                    display.setText(String.valueOf(result));
                    break;
                case "*":
                    value = display.getText();
                    sNum = Double.parseDouble(value);
                    result = this.fNum * this.sNum;
                    display.setText(String.valueOf(result));
                    break;
                case "/":
                    result = 0f;
                    value = display.getText();
                    this.sNum = Double.parseDouble(value);
                   try {
                       result = fNum /sNum;
                   }catch(Exception numberException){
                       display.setText("Logic error has occurred");
                   }
                    display.setText(String.valueOf(result));
                   break;
            }

        }
    }
}

