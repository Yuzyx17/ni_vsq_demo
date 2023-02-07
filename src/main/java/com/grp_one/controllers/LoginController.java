package com.grp_one.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import com.grp_one.Main;

public class LoginController implements Initializable {

    @FXML
    private TextField userField;

    @FXML
    private PasswordField passField;

    @FXML
    private void adminLogin(ActionEvent event) throws Exception {
        Main.setRoot("dashboard", "Dashboard");
        Main.centerRoot();
        Main.showStage();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
