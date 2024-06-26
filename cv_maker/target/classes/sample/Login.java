package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
//import javafx.scene.web.WebView;

import java.io.IOException;

//Add the functionality to save the text field on given data

public class Login {
    public Login(){

    }



@FXML
private Button button;

@FXML
    private Label wronglogin;

@FXML
    private TextField username;
@FXML
    private PasswordField passwo;

@FXML

private Button linkedin;


public void userlogin(ActionEvent event) throws IOException{
    checklogin();
}

public void skip(ActionEvent event) throws IOException{
    Main m=new Main();
    m.changeScene("styles/CVUI.fxml");

}
public void checklogin() throws IOException{

    if(username.getText().toString().equals("kiranreddy") && passwo.getText().toString().equals("ki")){
        Main m=new Main();
        wronglogin.setText("Success!");
        m.changeScene("styles/CVUI.fxml");
    }

    else if(username.getText().isEmpty() && passwo.getText().isEmpty()){
        wronglogin.setText("Please enter your data");
    }

    else{
        wronglogin.setText("Wrong username or password");
    }
}













}
