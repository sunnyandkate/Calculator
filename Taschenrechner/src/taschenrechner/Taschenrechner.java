package taschenrechner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Taschenrechner extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage meineStage) throws Exception {
		//Datei laden
		Parent root = FXMLLoader.load(getClass().getResource("taschenrechner.fxml"));

		//Szene erzeugen
		Scene meineScene = new Scene(root, 400, 250);
		
		//Titel über stage setzen
		meineStage.setTitle("Taschenrechner");
		//Szene setzen
		meineStage.setScene(meineScene);
		//anzeigen
		meineStage.show();
		
	}

}
