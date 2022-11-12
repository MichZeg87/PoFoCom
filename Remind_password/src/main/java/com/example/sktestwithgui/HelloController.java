package com.example.sktestwithgui;

import com.sendemail.Application;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {
    Application application = new Application();
    @FXML
    private TextField domena;

    @FXML
    private TextField adresEmail;

    @FXML
    private Text result;


    @FXML
    void start(MouseEvent event) {
       result.setText(application.sendEmailToUser(domena.getText(), adresEmail.getText()));
    }

}