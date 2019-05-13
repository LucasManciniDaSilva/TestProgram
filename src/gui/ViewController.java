package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;

public class ViewController implements Initializable {

	//Create a variable that reference a combo box
	@FXML
	private ComboBox<Person> comboBox;

	//Create a variable of the type ObservableList to receive the values of Person.
	private ObservableList<Person> obsList;
	
	//Method to print the values on the ComboBox.
	@FXML
	public void onComboAction() {
		Person person = comboBox.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}

	//method to initialize the ComboBox
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//instantiated a list of Person.
		List<Person> list = new ArrayList<>();
		//added values in the list.
		list.add(new Person(1, "Ike", "Ike@gmail.com"));
		list.add(new Person(1, "Marth", "Marthe@gmail.com"));
		list.add(new Person(1, "Roy", "Roy@gmail.com"));
    
		//Load the itens in the list
		obsList = FXCollections.observableArrayList(list);
		//Set the itens that be showed in ComboBox
		comboBox.setItems(obsList);

		//Create a list factory and a lamba function to return only the name in the ComboBox
		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			protected void updateItem(Person item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getName());
			}
		};
		
		comboBox.setCellFactory(factory);
		comboBox.setButtonCell(factory.call(null));

	}

}