package lk.ijse.javafx;

/*
    @author DanujaV
    @created 9/18/23 - 3:56 PM   
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //load scene graph to the application
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

        //create a new Scene
        Scene scene = new Scene(rootNode);

        //set scene to the primary stage
        stage.setScene(scene);

        //set a title and set center on screen
        stage.setTitle("Main Form");
        stage.centerOnScreen();

        //show scene to the crowd
        stage.show();
    }
}
