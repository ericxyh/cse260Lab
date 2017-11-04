import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ColorSlider extends Application {

	Slider r = new Slider(0, 255, 0);
	Slider g = new Slider(0, 255, 0);
	Slider b = new Slider(0, 255, 0);
	Slider opacity = new Slider(0, 1, 1);
	Text test = new Text("Sample");
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane pane = new BorderPane();
		Pane centerPane = new Pane();
		test.setX(230);
		test.setY(130);
		test.opacityProperty().bind(opacity.valueProperty());
		centerPane.getChildren().add(test);
		pane.setCenter(centerPane);
		
		VBox sliderPane = new VBox(20);
		sliderPane.getChildren().addAll(r, g, b, opacity);
		pane.setBottom(sliderPane);
		
		Scene scene = new Scene(pane, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		new Thread(() -> {
			while (true) {
				test.setFill(Color.rgb((int)r.getValue(), 
										(int)g.getValue(),
										(int)b.getValue(), 
										opacity.getValue()));
			}
		}).start();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
