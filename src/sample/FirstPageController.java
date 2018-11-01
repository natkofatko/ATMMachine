package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class FirstPageController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }


        @FXML
        private TextField cardno;

    @FXML
    private TextField pinno;
    @FXML  private Button XXXX;
    @FXML private Button signup;
    @FXML private Button exit;
    @FXML private Label textMessage;


    public void checkCredentials() {
    }

        //create a log in function
        @FXML
        public void signin(ActionEvent e)  throws Exception {

            if (this.cardno.getText().equalsIgnoreCase("123") && this.pinno.getText().equalsIgnoreCase("123")) {

//
                Stage stage = (Stage) this.textMessage.getScene().getWindow();
                stage.close();
                Stage userStage = new Stage();
                FXMLLoader loader = new FXMLLoader();
                Pane root = (Pane) loader.load(Main.class.getResource("/Account/AccountFXML.fxml"));
                //StudentController studentContr = (StudentController)loader.getController();
                Scene scene = new Scene(root);
                userStage.setScene(scene);
                userStage.isResizable();
                userStage.setTitle("Welcome to ATM");
                userStage.show();
                userStage.setResizable(false);


            } else {



            }
        }
            public void Exit(ActionEvent event)
    {
        try
        {
            System.exit(0);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }



//
//
//            }
//
//            catch (Exception ex)
//            {
//                ex.printStackTrace();
//            }
        }






