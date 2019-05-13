package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) { 
	     try {
	    	 //instantiated Parent receiving the View.
	    	 	Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
	    	 //Instantiated a scene receiving the value of the parent.
	    	 	Scene scene = new Scene(parent);
	    	 //method to set the scene on the screen
	    	 	stage.setScene(scene);
	    	 //Show the Scene.
	    	 	stage.show();
		}
	     catch(Exception e)
	{
		e.printStackTrace();
	}
	}

	public static void main(String[] args) {
		launch(args);
	}
}