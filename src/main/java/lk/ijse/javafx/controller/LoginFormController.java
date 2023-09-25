package lk.ijse.javafx.controller;

/*
    @author DanujaV
    @created 9/25/23 - 12:31 PM   
*/

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.javafx.db.Db;

public class LoginFormController {
    public TextField txtUserName;
    public TextField txtPassword;

    public void btnLoginOnAction(ActionEvent actionEvent) {
        String userName = txtUserName.getText();
        String pw = txtPassword.getText();

        if(Db.USER_NAME.equals(userName) && Db.PW.equals(pw)) {
            System.out.println("now we can navigate to the main form");
        } else {
            new Alert(Alert.AlertType.ERROR, "oops! credentials are wrong!").show();
        }
    }
}
