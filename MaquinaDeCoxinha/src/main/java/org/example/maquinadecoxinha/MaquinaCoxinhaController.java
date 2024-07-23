package org.example.maquinadecoxinha;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

public class MaquinaCoxinhaController {
    Integer estoque = 0;

    @FXML
    private TextField titulo;

    @FXML
    private TextField estoqueDeCoxinhas;

    @FXML
    private ChoiceBox<Integer> abastecer;

    @FXML
    private ChoiceBox<Integer> vender;

    @FXML
    private Button enviar;

    @FXML
    private Button zerar;

    @FXML
    private Label labelAbastecer;

    @FXML
    private Label labelVender;

    private Integer getEStoque(){
        return estoque;
    }

    private void setEstoque(Integer estoque){
        this.estoque = estoque;
    }

    @FXML
    private void abastecerCozinhas(){
        if(abastecer.getValue() > 0) {
            int quantidade = abastecer.getValue();
            setEstoque(quantidade);
            estoqueDeCoxinhas.setText("Estoque " + Integer.toString(quantidade));
        }else{
            return;
        }

    }

    @FXML
    private void venderCozinhas(){
        if(estoque > 0 ){
            int quantidade = vender.getValue();
            if(vender.getValue() == 1) {
                setEstoque(getEStoque() - quantidade);
            }else {
                if(getEStoque() > quantidade){

                }
            }
        }
    }

}
