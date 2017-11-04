import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Pendulum extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		Circle cir = new Circle(10);
		QuadCurve quad = new QuadCurve(500.0/4, 300, 500.0/2, 500.0/4*3, 1500.0/4, 300);
		pane.getChildren().addAll(cir);
		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(1000));
		pt.setPath(quad);
		pt.setNode(cir);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.play();
		pane.requestFocus();
		/*pane.setOnKeyPressed(e ->{
			if (e.getCode() == KeyCode.S) {
				pt.pause();
			}
			if (e.getCode() == KeyCode.R) {
				pt.play();
			}
			if (e.getCode() == KeyCode.UP) {
				pt.setDuration(pt.getDuration().subtract(Duration.millis(100)));
			}
			if (e.getCode() == KeyCode.DOWN) {
				pt.setDuration(pt.getDuration().add(Duration.millis(100)));
			}
		});*/
		
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
