import java.util.ArrayList;
import java.util.HashSet;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class BoundRectangle extends Application {

	Rectangle bound = new Rectangle();
	ArrayList<double[]> set = new ArrayList<>();

	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		pane.getChildren().add(bound);
		pane.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				double x = e.getSceneX();
				double y = e.getSceneY();
				double[] xy = { x, y };
				Circle temp = new Circle(x, y, 10);
				temp.setOnMouseClicked(e2 -> {
					if (e2.getButton() == MouseButton.SECONDARY) {
						double[] tempxy = { temp.getCenterX(), temp.getCenterY() };
						set.remove(tempxy);
						pane.getChildren().remove(temp);
						setBound(pane);
					}
				});
				if (!set.contains((double[]) xy)) {
					set.add((double[]) xy);
					pane.getChildren().add(temp);
				}
				setBound(pane);
			}
		});

		Scene scene = new Scene(pane, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void setBound(Pane pane) {
		pane.getChildren().remove(bound);
		bound = rebound(bound);
		pane.getChildren().add(bound);

	}

	private Rectangle rebound(Rectangle bound) {
		double x1 = borderElement(0, true);
		double y1 = borderElement(1, true);
		double x2 = borderElement(0, false);
		double y2 = borderElement(1, false);
		Rectangle newBound = new Rectangle(x1, y1, (x2 - x1), (y2 - y1));
		newBound.setFill(Color.WHITE);
		newBound.setStroke(Color.BLACK);
		return newBound;
	}

	private double borderElement(int i, boolean b) {
		ArrayList<Double> compare = new ArrayList<>();
		for (double[] ds : set) {
			compare.add(ds[i]);
		}
		compare.sort(null);
		if (b) {
			return compare.get(0);
		}
		return compare.get(compare.size() - 1);
	}

	public static void main(String[] args) {
		launch(args);
	}

}