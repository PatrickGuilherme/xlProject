/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import model.Tabuleiro;

/**
 * FXML Controller class
 *
 * @author be301
 */
public class TelaFinalController implements Initializable {

    @FXML private Label nomeVencedor;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        nomeVencedor.setText(Tabuleiro.getTabuleiro().getVencedor());
    }    
    
}
