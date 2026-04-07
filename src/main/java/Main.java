import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import mvcModel.StoreModel;
import mvcModel.ViewTransitionModel;
import mvcViews.MainController;

public class Main extends Application {

	public static void main(String[] args)
	{
		launch(args);
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		StoreModel model = new StoreModel();
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("mvcViews/mainView.fxml"));
		
		BorderPane view = loader.load();
		
		MainController cont = loader.getController();
		ViewTransitionModel vm = new ViewTransitionModel(view, model);
		cont.setModel(vm);
		
		
		Scene s = new Scene(view);
		stage.setScene(s);
		stage.show();
		
	}

}
