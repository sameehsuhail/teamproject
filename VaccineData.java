package application;  

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.text.*; 
import javafx.scene.layout.VBox; 

public class VaccineData extends BorderPane { //VaccineData class inherits properties of BorderPane class
	
	private GridPane grid = new GridPane();
	
	public VaccineData() {
		
		//VBox contains all of the buttons on the left hand side of the scene
		VBox buttonPane = new VBox();
	    buttonPane.setSpacing(20);
	    buttonPane.setPadding(new Insets(10, 0, 10, 0));
	    
	    //The required buttons 
	    Button aboutButton = new Button("About");
	    Button loadButton = new Button("Load Data");
	    Button addButton = new Button("Add Data");
	    Button saveButton = new Button("Save Data");
	    Button visualizeButton = new Button("Visualize Data");
	    
	    aboutButton.setMaxWidth(Double.MAX_VALUE);
	    loadButton.setMaxWidth(Double.MAX_VALUE);
	    addButton.setMaxWidth(Double.MAX_VALUE);
	    saveButton.setMaxWidth(Double.MAX_VALUE);
	    visualizeButton.setMaxWidth(Double.MAX_VALUE);
	    
		buttonPane.getChildren().addAll(aboutButton, loadButton, addButton, 
		saveButton, visualizeButton);
		
		//GridPane contains the actions, such as text display and text fields after button click
		grid.setPadding(new Insets(10, 10, 10, 10)); 
		grid.setHgap(5);
		grid.setVgap(5);
		grid.getStyleClass().add("bg-1");
		
		this.setLeft(buttonPane);
		this.setCenter(grid);
		
		aboutButton.setOnAction((event) -> {
			grid.getChildren().clear();
			
			Text teamNumber = new Text("Team Project Group 5 ");
			grid.add(teamNumber, 0, 2);
			
			Text member1 = new Text("Team member 1 : Advay Ramesh");
			grid.add(member1, 0, 3);
			
			Text member2 = new Text("Team member 2 : Ali Aldulaimi");
			grid.add(member2, 0, 4);
			
			Text member3 = new Text("Team member 3 : Krishna Prasad Sheshadri");
			grid.add(member3, 0, 5);
			
			Text member4 = new Text("Team member 4 : Sameeh Gafoor Suhail");
			grid.add(member4, 0, 6);
			
			Text member5 = new Text("Team member 5 : Shreyas Kulkarni");
			grid.add(member5, 0, 7);
		});
		
		TextField dateField = new TextField();
		TextField idField = new TextField();
		TextField lastNameField = new TextField();
		TextField firstNameField = new TextField();
		TextField vacTypeField = new TextField();
		TextField vacLocationField = new TextField();
		
		addButton.setOnAction((event) -> {
			grid.getChildren().clear();
			
			Text date = new Text("Date: ");
			grid.add(date, 0, 2);
			
			Text id = new Text("ID: ");
			grid.add(id, 0, 3);
			
			Text lastName = new Text("Last Name: ");
			grid.add(lastName, 0, 4);
			
			Text firstName = new Text("First Name: ");
			grid.add(firstName, 0, 5);
			
			Text vaccineType = new Text("Vaccine Type: ");
			grid.add(vaccineType, 0, 6);
			
			Text vaccineLocation = new Text("Vaccine Location: ");
			grid.add(vaccineLocation, 0, 7);
		
			grid.add(dateField, 2, 2);
			
			grid.add(idField, 2, 3);
			
			grid.add(lastNameField, 2, 4);
			
			grid.add(firstNameField, 2, 5);
			
			grid.add(vacTypeField, 2, 6);
			
			grid.add(vacLocationField, 2, 7);
		});
		
		saveButton.setOnAction((event) ->{
			dateField.clear();
			idField.clear();
			lastNameField.clear();
			firstNameField.clear();
			vacTypeField.clear();
			vacLocationField.clear();
			
		});
			
	}
	
}
