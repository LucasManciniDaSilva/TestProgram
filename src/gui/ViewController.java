package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{

	@FXML
	private TextField textNumber1;

	@FXML
	private TextField textNumber2;

	@FXML
	private Label result;

	@FXML
	private Button Sum;

	public void onTestAction() {
		try {
			double num1 = Double.parseDouble(textNumber1.getText());
			double num2 = Double.parseDouble(textNumber2.getText());
			double sum = num1 + num2;
			result.setText(String.format("%.2f", sum));
			
		}
		catch(NumberFormatException e){
		
		Alerts.showAlert("Teste", null, e.getMessage(), AlertType.ERROR);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Constraints.setTextFieldInteger(textNumber1);
		Constraints.setTextFieldInteger(textNumber2);
		
		
	}
	
}