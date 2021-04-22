package application;  

import application.Data_applications;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.function.UnaryOperator;
import java.util.List;
import javax.swing.event.ChangeListener;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.text.*;
import javafx.util.converter.DateTimeStringConverter;
import javafx.scene.layout.VBox; 

public class VaccineData extends BorderPane { //VaccineData class inherits properties of BorderPane class
	
	private GridPane grid = new GridPane();
	
	public VaccineData() {
		
		
		//instance of the other class
		Data_applications foo= new Data_applications();
		String path="/Users/shreyas/Downloads/TeamProjectRandomData - 10People.csv";
		
		//VBox contains all of the buttons on the left hand side of the scene
		VBox buttonPane = new VBox();
	    buttonPane.setSpacing(20);
	    buttonPane.setPadding(new Insets(10, 0, 10, 0));
	    
	    //The required buttons 
	    Button aboutButton = new Button("About");
	    Button loadButton = new Button("Load Data");
	    Button addButton = new Button("Add Data");
	    Button submitButton = new Button("Submit");
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
			dateField.setPromptText("Please enter in mm/dd/yyyy");

			
			grid.add(idField, 2, 3);
			idField.setPromptText("Enter a number");

			
			grid.add(lastNameField, 2, 4);
			lastNameField.setPromptText("Enter your last name");

			
			grid.add(firstNameField, 2, 5);
			firstNameField.setPromptText("Enter your first name");
			
			grid.add(vacTypeField, 2, 6);
			vacTypeField.setPromptText("Enter your vacc type");
			
			grid.add(vacLocationField, 2, 7);
			vacLocationField.setPromptText("Enter your vacc location");
			
			grid.add(submitButton, 2, 9);
						
			int check = 0;
			
			//enter check date
			foo.Vaccine_date = dateField.getText();
			char[] s = foo.Vaccine_date.toCharArray();
			
			for(int i =0;i<s.length;i++) {
				
				if(i == 2 || i == 5) {
					i++;
				}
				char chk = s[i];
				if(!(chk >= '0' && chk <='9')) {
					check = 1;
				}
				
				
			}
			
			//enter check id
			foo.ID = idField.getText();
			
			for (int i = 0; i < foo.ID.length(); i++) {
				if (foo.ID.charAt(i) >= '0'
		            && foo.ID.charAt(i) <= '9') {
		        }
		        else {
		            check = 1;
		        }
		    }
		     
			//enter check lastname
		
			foo.Last_Name = lastNameField.getText();
			foo.Last_Name.toLowerCase();
			char[] s1 = foo.Last_Name.toCharArray();
			for(int i =0;i<foo.Last_Name.length();i++) {
				char chk1 = s1[i];
				if(!(chk1 >= 'a' && chk1 <='z')) {
					check = 1;
				}
			}
		 
		//enter check firstname
		 
			foo.First_Name = firstNameField.getText();
			foo.First_Name.toLowerCase();
			char[] s2 = foo.First_Name.toCharArray();
			for(int i =0;i<foo.First_Name.length();i++) {
				char chk2 = s2[i];
				if(!(chk2 >= 'a' && chk2 <='z')) {
					check = 1;
				}
			}
		 
		 
			foo.Vaccine_type = vacTypeField.getText();
			foo.Vaccine_type.toLowerCase();
			char[] s3 = foo.Vaccine_type.toCharArray();
			for(int i =0;i<foo.Vaccine_type.length();i++) {
				char chk3 = s3[i];
				if(!(chk3 >= 'a' && chk3 <='z')) {
					check = 1;
				}
			}
		 
			foo.Vaccine_location = vacLocationField.getText();
			foo.Vaccine_location.toLowerCase();
			char[] s4 = foo.Vaccine_location.toCharArray();
			for(int i =0;i<foo.Vaccine_location.length();i++) {
				char chk4 = s4[i];
				if(!(chk4 >= 'a' && chk4 <='z')) {
					check = 1;
				}
			}
		 			
			dateField.clear();
			idField.clear();
			lastNameField.clear();
			firstNameField.clear();
			vacTypeField.clear();
			vacLocationField.clear();
		});
		
		saveButton.setOnAction((event) ->{
			foo.save_data();
		});
		
		submitButton.setOnAction((event) ->{
			foo.add_data();
		});
		
		loadButton.setOnAction((event) ->{
			foo.load_data(path);
		});
		
		
		
			
	}
	
}
