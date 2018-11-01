package Account;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javax.print.DocFlavor;
import javax.swing.*;

import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class AccountController implements Initializable{

    public void initialize(URL url, ResourceBundle rb)
    {
    }
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button zero;
    @FXML
    private Button clear;
    @FXML
    private Button exit;
    @FXML
    private Button enter;
    @FXML
    private TextField pintext;
@FXML
private Label wrongpin;

    @FXML
    private void ClickOne(ActionEvent event)
    {
        String one= pintext.getText()+ "1";
        pintext.setText(one);
    }
    @FXML
    private void Clicktwo(ActionEvent event)
    {
        String two= pintext.getText()+ "2";
        pintext.setText(two);
    }
    @FXML
    private void ClickThree(ActionEvent event)
    {
        String three= pintext.getText()+ "3";
        pintext.setText(three);
    }
    @FXML
    private void ClickFour(ActionEvent event)
    {
        String four= pintext.getText()+ "4";
        pintext.setText(four);
    }
    @FXML
    private void ClickFive(ActionEvent event)
    {
        String five= pintext.getText()+ "5";
        pintext.setText(five);
    }
    @FXML
    private void ClickSix(ActionEvent event)
    {
        String six= pintext.getText()+ "6";
        pintext.setText(six);
    }
    @FXML
    private void ClickSeven(ActionEvent event)
    {
        String seven= pintext.getText()+ "7";
        pintext.setText(seven);
    }
    @FXML
    private void ClickEight(ActionEvent event)
    {
        String eight= pintext.getText()+ "8";
        pintext.setText(eight);
    }
    @FXML
    private void ClickNine(ActionEvent event)
    {
        String nine= pintext.getText()+ "9";
        pintext.setText(nine);
    }
    @FXML
    private void ClickZero(ActionEvent event)
    {
        String zero= pintext.getText()+ "0";
        pintext.setText(zero);
    }

    @FXML
    private void ClearEverything(ActionEvent event)
    {
        pintext.setText("");
        wrongpin.setText("");
    }
    @FXML
    private void ExitATM(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("EXIT");
        alert.setHeaderText("Click OK to close the window");
        //alert.setContentText("Are you sure you want to close?");
        alert.showAndWait();
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            Stage stage = (Stage) this.exit.getScene().getWindow();
            stage.close();
        }

        if (result.get() == ButtonType.CANCEL) {
            alert.close();

        }
    }

        //create a log in function
        @FXML
        public void signin(ActionEvent event)  throws Exception {

        if (this.pintext.getText().equalsIgnoreCase("123")){
//
            Stage stage = (Stage) this.pintext.getScene().getWindow();
           stage.close();

            Stage userStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Main.class.getResource("/sample/sample.fxml"));
            //StudentController studentContr = (StudentController)loader.getController();
            Scene scene = new Scene(root);
            userStage.setScene(scene);
            userStage.isResizable();
            userStage.setTitle("Welcome to ATM");
            userStage.show();
            userStage.setResizable(false);


        }
        else {

            this.wrongpin.setText("Wrong credentials");
        }
    }
}


