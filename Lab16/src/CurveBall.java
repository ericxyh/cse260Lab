import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CurveBall extends Application {

	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		Polyline sinline = new Polyline();
		ObservableList<Double> list = sinline.getPoints();
		for (int x = -170; x <= 170; x++) {
			list.add(x + 200.0);
			list.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
		}
		sinline.setStroke(Color.RED);
		Circle cir = new Circle(20);
		pane.getChildren().addAll(sinline, cir);
		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setPath(sinline);
		pt.setNode(cir);
		pt.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.play();
		pt.setOnFinished(e -> pt.play());;
		
		pane.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pt.play();
			}
			if (e.getButton() == MouseButton.SECONDARY) {
				pt.pause();
			}
		});
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	


}
