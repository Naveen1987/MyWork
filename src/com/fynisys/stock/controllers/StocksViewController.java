/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fynisys.stock.controllers;


import java.net.URL;

import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.SequentialTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Daffodil
 */

public class StocksViewController implements Initializable {

  private static final  Logger logger=Logger.getLogger("Stock View Controller");
    @FXML   private AnchorPane filterPanel;
    @FXML   private AnchorPane RightHBox;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        filterPanel.setVisible(false);
    }    
    private boolean toggle=true;
     @FXML public void showFilter(ActionEvent event){
         //Next
        if(toggle){
        logger.info("Filter Pane Is Hiding");
        ResizeHeightTranslation rht = new ResizeHeightTranslation(Duration.millis(80), filterPanel, filterPanel.getMinHeight());
        FadeTransition ft = new FadeTransition(Duration.millis(10), filterPanel);
        ft.setFromValue(0);
        ft.setToValue(1);
        SequentialTransition pt = new SequentialTransition(rht, ft);
        pt.play();
        filterPanel.setVisible(true);
        RightHBox.setDisable(true);
        toggle=false;
         }
         else{
         logger.info("Filter Pane Is Showing");
         filterPanel.setVisible(false);
         RightHBox.setDisable(false);
         toggle=true; 
         }
         
//         if(toggle){
//        logger.info("Hi");
        //filterPanel.setVisible(true);
//        toggle=false;
//     }
//     else{
//        logger.info("Bye");
//       //  filterPanel.setVisible(false);
//         toggle=true; 
//     }
         
         //Next---------------
         //        TranslateTransition openNav=new TranslateTransition(new Duration(350), filterPanel);
//        openNav.setToX(0);
//        TranslateTransition closeNav=new TranslateTransition(new Duration(350), filterPanel);
//            if(filterPanel.getTranslateX()!=0){
//                openNav.play();
//            }else{
//                closeNav.setToX(-(filterPanel.getWidth()));
//                closeNav.play();
//            }
     }
//public VBox addFilterControls (){
//    VBox vbox=new VBox();
//    TextField txt=new TextField();
//    vbox.getChildren().add(txt);
//    Button button=new Button();
//    button.setText("Submit");
//    button.setOnAction(new EventHandler<ActionEvent>() {
//        @Override
//        public void handle(ActionEvent event) {
//            txt.setText("Accepted");
//        }
//    });
//    return vbox;
//}
}
