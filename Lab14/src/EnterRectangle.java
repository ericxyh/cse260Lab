import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EnterRectangle extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		
		Pane centerPane = new Pane();
		
		HBox hBox = new HBox(12);
		Text centerX = new Text("x-coord");
		TextField enterX = new TextField();
		hBox.getChildren().addAll(centerX, enterX);
		Text centerY = new Text("y-coord");
		TextField enterY = new TextField();
		hBox.getChildren().addAll(centerY, enterY);
		Text height = new Text("Height");
		TextField enterH = new TextField();
		hBox.getChildren().addAll(height, enterH);
		Text width = new Text("Width");
		TextField enterW = new TextField();
		hBox.getChildren().addAll(width, enterW);
		Button make = new Button("Make Rectangle");
		make.setOnAction(e -> {centerPane.getChildren().add( new Rectangle(
				Double.parseDouble(enterX.getText()),
				Double.parseDouble(enterY.getText()), 
				Double.parseDouble(enterW.getText()),
				Double.parseDouble(enterH.getText())));} );
		hBox.getChildren().add(make);
		pane.setTop(hBox);
		
		pane.setCenter(centerPane);
		Scene scene = new Scene(pane, 1000, 600);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
