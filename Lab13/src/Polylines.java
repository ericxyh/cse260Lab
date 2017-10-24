import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Polylines extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		Pane pane = new Pane();
		
		Polyline polyline = new Polyline();
		ObservableList list = polyline.getPoints();
		double scaleFactor = 0.0125;
		for (int x = -100; x <= 100; x++) {
			list.add(x + 200.0);
			list.add(scaleFactor * x * x * -1 + 500);
		}
		pane.getChildren().add(polyline);
		
		Scene scene = new Scene(pane, 500, 500);
		arg0.setScene(scene);;
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
