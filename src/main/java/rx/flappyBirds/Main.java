package rx.flappyBirds;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) {
		int screenWidth = 691;
		int screenHeight = 921;
		
		StackPane root = new StackPane();
		root.setAlignment(Pos.BOTTOM_LEFT);
		Scene scene = new Scene(root, screenWidth, screenHeight);
		
		// Background
		Image bgImg = new Image("background.png");
		ImageView background = new ImageView(bgImg);
		root.getChildren().add(background);
		background.setTranslateY(-115);

		// Bottom
		Image bottomImg = new Image("ground.png");
		double bottomWidth = bottomImg.getWidth();
		int numberOfImgs = Double.valueOf(Math.ceil(screenWidth / bottomWidth)).intValue();

		for (int i = 0; i < numberOfImgs; i++) {
			ImageView tile = new ImageView(bottomImg);
			root.getChildren().add(tile);
			tile.setTranslateX(i * bottomWidth);
		}
		
		// Pipe
		Image pipeImg = new Image("pipe.png");
		ImageView pipeUp = new ImageView(pipeImg);
		ImageView pipeDown = new ImageView(pipeImg);
		root.getChildren().add(pipeUp);
		root.getChildren().add(pipeDown);
		pipeUp.setRotate(180.0);
		pipeUp.setTranslateY(200 - screenHeight);//change this!
		pipeDown.setTranslateY(200);//change this!
		
		
		
		
		stage.setTitle("Flappy Bird");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch();
	}
}
