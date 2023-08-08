package application;

import java.io.IOException;
import java.net.URL;
//import java.sql.SQLException;
import java.util.ResourceBundle;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class DashboardController implements Initializable{
	
	  @FXML
	    private Button btnDash;

	    @FXML
	    private Button btnLog;

	    @FXML
	    private Button btnProf;

	    @FXML
	    private AnchorPane pn2;

	    @FXML
	    private AnchorPane tabpn1;

    
	    
	@FXML
	private void HandleClicks(ActionEvent e ) throws IOException{
		
		    if(e.getSource() == btnDash)
		    {
		    	btnProf.setStyle("-fx-background-color:  #FFDDCC");
		    	btnDash.setStyle("-fx-background-color: #fba177");
		    	
		    	
		    tabpn1.setVisible(true);
		    pn2.setVisible(false);
		    	
		    }
		    if(e.getSource() == btnProf) 
		    {   
		    	btnDash.setStyle("-fx-background-color:  #FFDDCC");
		    	btnProf.setStyle("-fx-background-color: #fba177");
		    	
		    tabpn1.setVisible(false);
		    pn2.setVisible(true);
		    }
		    if(e.getSource() == btnLog) 
		    {   
		    	switchToHome();
		    }
	        
	     }
	 	    
	@FXML
    private void switchToHome() throws IOException {
       Main.setRoot("Home");
    }
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
    btnDash.setStyle("-fx-background-color: #fba177");
  
		
	}
	
	
	
}