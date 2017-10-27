package application;
	
import GUI.GameGUI;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GameGUI root = new GameGUI();
			Scene scene = new Scene(root, 500, 560);
			scene.getStylesheets().add("application/application.css"); 
			primaryStage.setTitle("Maze Game");
			primaryStage.setScene(scene);
			primaryStage.show();
			root.createMap();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}