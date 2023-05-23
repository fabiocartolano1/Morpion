package com.example.morpion;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController{

    private int numeroDuTour = 0;
    private boolean victoire = false;
    @FXML
    private GridPane grille;

    @FXML
    private Label winner;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;
    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    public void affecterText(Button btn){
        if(!victoire){
            if(numeroDuTour%2 != 0){
                btn.setText("X");
            }else btn.setText("O");
            numeroDuTour++;
            checkWin(); 
        }
    }

    private void checkWin() {
        checkColonnes();
        checkLignes();
        checkDiags();
    }

    private void checkDiags() {
        if(btn1.getText() != "" && (btn1.getText() == btn5.getText() && btn5.getText() == btn9.getText())){
            win();
        }else if (btn3.getText() != "" && (btn3.getText() == btn5.getText() && btn5.getText() == btn7.getText())){
            win();
        }
    }

    private void checkLignes() {
        if(btn1.getText() != "" && (btn1.getText() == btn2.getText() && btn2.getText() == btn3.getText())){
            win();
        }else if (btn4.getText() != "" && (btn4.getText() == btn5.getText() && btn5.getText() == btn6.getText())){
            win();
        }else if (btn7.getText() != "" && (btn7.getText() == btn8.getText() && btn8.getText() == btn9.getText())){
            win();
        }

    }

    private void checkColonnes() {
        if(btn1.getText() != "" && (btn1.getText() == btn4.getText() && btn4.getText() == btn7.getText())){
            win();
        }else if (btn2.getText() != "" && (btn2.getText() == btn5.getText() && btn5.getText() == btn8.getText())){
            win();
        }else if (btn3.getText() != "" && (btn3.getText() == btn6.getText() && btn6.getText() == btn9.getText())){
            win();
        }
    }
    private void win() {
        if(numeroDuTour % 2 == 0){
            winner.setText("les X ont gagnés");
        }else winner.setText("les O ont gagnés");
        victoire = true;
    }


    public void clickBtn1(){
        affecterText(btn1);
    }
    public void clickBtn2(){
        affecterText(btn2);
    }
    public void clickBtn3(){
        affecterText(btn3);
    }
    public void clickBtn4(){
        affecterText(btn4);
    }
    public void clickBtn5(){
        affecterText(btn5);
    }
    public void clickBtn6(){
        affecterText(btn6);
    }
    public void clickBtn7(){
        affecterText(btn7);
    }
    public void clickBtn8(){
        affecterText(btn8);
    }
    public void clickBtn9(){
        affecterText(btn9 );
    }

}