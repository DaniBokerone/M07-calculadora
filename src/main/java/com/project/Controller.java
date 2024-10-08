package com.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class Controller {


    @FXML
    private TextField textField;

    @FXML
    private Text operacioGuardada;

    private String primerNumero = "";

    private String numeroActual = "";

    private String tipusOperacio;

    @FXML
    void suma(ActionEvent event) {
        prepararCalcul("+");
    }

    @FXML
    void resta(ActionEvent event) {
        prepararCalcul("-");
    }

    @FXML
    void divisio(ActionEvent event) {
        prepararCalcul("/");
    }

    @FXML
    void multiplicacio(ActionEvent event) {
        prepararCalcul("*");
    }

    public void prepararCalcul(String tipusOperacio){
        this.tipusOperacio = tipusOperacio;
        primerNumero = numeroActual;
        numeroActual = "";
        operacioGuardada.setText(primerNumero + " " + tipusOperacio);
    }

    @FXML
    void calcular(ActionEvent event) {
        int primerNumeroInt = Integer.parseInt(primerNumero);
        int segonNumeroInt = Integer.parseInt(numeroActual);

        switch (tipusOperacio) {
            case "+" -> {
                int total = primerNumeroInt + segonNumeroInt;
                operacioGuardada.setText(primerNumero + " + " + numeroActual + " = " + total);
                textField.setText(String.valueOf(total));
            }
            case "-" -> {
                int total = primerNumeroInt - segonNumeroInt;
                operacioGuardada.setText(primerNumero + " - " + numeroActual + " = " + total);
                textField.setText(String.valueOf(total));
            }
            case "/" -> {
                double total = primerNumeroInt / (double)segonNumeroInt;
                operacioGuardada.setText(primerNumero + " / " + numeroActual + " = " + total);
                textField.setText(String.valueOf(total));
            }
            case "*" -> {
                int total = primerNumeroInt * segonNumeroInt;
                operacioGuardada.setText(primerNumero + " * " + numeroActual + " = " + total);
                textField.setText(String.valueOf(total));
            }
        }
    }

    @FXML
    void netejarTextField(ActionEvent event) {
        numeroActual = "";
        textField.setText("");
        operacioGuardada.setText("");
    }

    @FXML
    void buto0Click(ActionEvent event) {
        if(!numeroActual.equals("")){
            afegirNumero("0");
        }
    }

    @FXML
    void buto1Click(ActionEvent event) {
        afegirNumero("1");
    }

    @FXML
    void buto2Click(ActionEvent event) {
        afegirNumero("2");
    }

    @FXML
    void buto3Click(ActionEvent event) {
        afegirNumero("3");
    }

    @FXML
    void buto4Click(ActionEvent event) {
        afegirNumero("4");
    }

    @FXML
    void buto5Click(ActionEvent event) {
        afegirNumero("5");
    }

    @FXML
    void buto6Click(ActionEvent event) {
        afegirNumero("6");
    }

    @FXML
    void buto7Click(ActionEvent event) {
        afegirNumero("7");
    }

    @FXML
    void buto8Click(ActionEvent event) {
        afegirNumero("8");
    }

    @FXML
    void buto9Click(ActionEvent event) {
        afegirNumero("9");
    }

    public void actualitzarTextfield(){
        textField.setText(numeroActual);
    }

    public void afegirNumero(String number){
        numeroActual += number;
        actualitzarTextfield();
    }
    
}
