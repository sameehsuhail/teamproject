package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;  

public class VaccineLayout extends Application { //VaccineLayout class inherits properties of Application class
	
    public void start(Stage stage) { //the JavaFX consists of the stage that will display the application
    	VaccineData gui = new VaccineData();
 		StackPane root = new StackPane();
 		root.getChildren().add(gui);
        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("COVID-19 Vaccination Application");
        stage.setScene(scene);
        stage.show();
    } 

    public static void main(String[] args) { //main method launches application
        launch(args);
    } 
}