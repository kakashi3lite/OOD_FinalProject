package application;


import java.io.IOException;
import java.net.URL;
//import java.sql.SQLException;
import java.util.ResourceBundle;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RegisterController {
	
	@FXML
    private void switchToHome() throws IOException {
       Main.setRoot("Home");
    }
	
	
	
}