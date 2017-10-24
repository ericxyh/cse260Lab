import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
public class TwoCircle extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		Circle cir1 = new Circle();
		Circle cir2 = new Circle();
		cir1.centerXProperty().bind(pane.widthProperty().multiply(Math.random()).subtract(1));
		cir1.centerYProperty().bind(pane.heightProperty().multiply(Math.random()).subtract(1));
		cir2.centerXProperty().bind(pane.widthProperty().multiply(Math.random()).subtract(1));
		cir2.centerYProperty().bind(pane.heightProperty().multiply(Math.random()).subtract(1));
		cir1.setRadius(15);
		cir2.setRadius(15);
		cir1.setFill(Color.DARKGOLDENROD);
		cir2.setFill(Color.AQUA);
		pane.getChildren().add(cir1);
		pane.getChildren().add(cir2);
		
		double length = Math.sqrt(Math.pow(cir1.centerXProperty().get() - cir2.centerXProperty().get(), 2) 
				+ Math.pow(cir1.centerYProperty().get() - cir2.centerYProperty().get(), 2));
		
		Line connect = new Line();
		connect.startXProperty().bind(cir1.centerXProperty());
		connect.startYProperty().bind(cir1.centerYProperty());
		connect.endXProperty().bind(cir2.centerXProperty());
		connect.endYProperty().bind(cir2.centerYProperty());
		connect.setFill(Color.BLACK);
		pane.getChildren().add(connect);
		
		System.out.println(length);
		
		Scene scene= new Scene(pane, 200, 200);
		primaryStage.setTitle("Two random circles");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
