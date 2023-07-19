package application;

import java.io.IOException;
import java.net.URL;
//import java.sql.SQLException;
import java.util.ResourceBundle;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class LoginController implements Initializable{

	@FXML 
	private Button log;
	
	 public void login(ActionEvent event) throws IOException {
	      
		 switchToDash();
		 System.out.println("working");
	 }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
   private void switchToDash() throws IOException{
        Main.setRoot("Dashboard");

    }
	
	
}