package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

/**
 *
 * 
 */
public class HomeController implements Initializable{
    
	@FXML 
	private Button log;
	
	 public void login(ActionEvent event) throws IOException {
	      
		 switchToDash();
		 System.out.println("working");
	 }
	
    @FXML
    private void switchToReg() throws IOException {
       Main.setRoot("Register");
    }
    
    @FXML
    private void switchToDash() throws IOException{
       Main.setRoot("Dashboard1");
    
    }
    
    @FXML
    private void switchToTeam() throws IOException{
        //App.setRoot("team");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
    
    
}
