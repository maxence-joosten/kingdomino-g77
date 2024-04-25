package main;

import domein.DomeinController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import taalmanager.vertaal;

public class StartUp extends Application {

	public static void main(String[] args) {

		vertaal.veranderTaal("resources/messages_en");
		System.out.println(vertaal.geefWoord("CREATE_USER"));

		vertaal.veranderTaal("resources/messages_en");
		System.out.println(vertaal.geefWoord("CREATE_USER"));

		// new MainApp(new DomeinController()).start();
		launch(args);
		// new DomeinController().startConsoleGame();

	}

	private DomeinController dc;

	@Override
	public void start(Stage primaryStage) {

		try {
			this.dc = new DomeinController();
			Parent root = FXMLLoader.load(getClass().getResource("/gui/menuStart.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
