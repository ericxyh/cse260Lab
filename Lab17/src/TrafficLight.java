import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TrafficLight extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane pane = new BorderPane();
		Pane centerPane = new Pane();
		Circle redC = new Circle(250, 60, 30);
		Circle yellowC = new Circle(250, 120, 30);
		Circle greenC = new Circle(250, 180, 30);
		centerPane.getChildren().addAll(redC, yellowC, greenC);
		pane.setCenter(centerPane);
		
		VBox radioPane = new VBox(10);
		RadioButton red = new RadioButton("Red");
		RadioButton yellow = new RadioButton("Yellow");
		RadioButton green = new RadioButton("Green");
		radioPane.getChildren().addAll(red, yellow, green);
		
		ToggleGroup group = new ToggleGroup();
		red.setToggleGroup(group);
		yellow.setToggleGroup(group);
		green.setToggleGroup(group);
		
		red.setOnAction(e -> {
			if (red.isSelected()) {
				redC.setFill(Color.RED);
				yellowC.setFill(Color.BLACK);
				greenC.setFill(Color.BLACK);
			}
		});
		yellow.setOnAction(e -> {
			if (yellow.isSelected()) {
				redC.setFill(Color.BLACK);
				yellowC.setFill(Color.YELLOW);
				greenC.setFill(Color.BLACK);
			}
		});
		green.setOnAction(e -> {
			if (green.isSelected()) {
				redC.setFill(Color.BLACK);
				yellowC.setFill(Color.BLACK);
				greenC.setFill(Color.GREEN);
			}
		});
		
		pane.setLeft(radioPane);
		Scene scene = new Scene(pane, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
