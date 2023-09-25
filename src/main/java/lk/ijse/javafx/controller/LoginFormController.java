package lk.ijse.javafx.controller;

/*
    @author DanujaV
    @created 9/25/23 - 12:31 PM   
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.javafx.db.Db;

import java.io.IOException;

public class LoginFormController {
    public TextField txtUserName;
    public TextField txtPassword;
    public AnchorPane root;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        String userName = txtUserName.getText();
        String pw = txtPassword.getText();

        if(Db.USER_NAME.equals(userName) && Db.PW.equals(pw)) {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/main_form.fxml"));

            Scene scene = new Scene(rootNode);

            Stage primaryStage = (Stage) this.root.getScene().getWindow();
            primaryStage.setScene(scene);

            primaryStage.setTitle("Main Window");
        } else {
            new Alert(Alert.AlertType.ERROR, "oops! credentials are wrong!").show();
        }
    }
}
