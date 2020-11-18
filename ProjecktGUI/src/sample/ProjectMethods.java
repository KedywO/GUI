package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class ProjectMethods {

    public void closeHandler(javafx.event.ActionEvent actionEvent) {
        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
    }

    public void createRegisterForm(){
        try {
            Parent root = null;
            root = FXMLLoader.load(getClass().getResource("register.fxml"));
            Stage registerStage = new Stage();
            //registerStage.setTitle("Register");
            registerStage.initStyle(StageStyle.UNDECORATED);
            registerStage.setScene(new Scene(root, 602, 677));
            registerStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            e.getCause();
        }

    }
    public void createLoginForm(){
        try {
            Parent root = null;
            root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Stage loginStage = new Stage();
            loginStage.initStyle(StageStyle.UNDECORATED);
            loginStage.setScene(new Scene(root, 752, 399));
            loginStage.show();
        }
        catch(Exception r){
            r.printStackTrace();
            r.getCause();
        }

    }

}
