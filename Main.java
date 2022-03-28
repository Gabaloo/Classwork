package application;
	
import java.awt.Button;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		    Button OkButton = new Button("OK");
		    Scene scene = new Scene(OkButton,200,250);
		    primaryStage.setScene(scene);
		    primaryStage.setTitle("My JavaFX");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
