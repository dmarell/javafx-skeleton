/*
 * Created by Daniel Marell 12-09-03 11:45 PM
 */
package se.marell.javafxskeleton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("javafx-skeleton");

        Button button = new Button("Button");
        BorderPane panel = new BorderPane();
        panel.setCenter(button);

        button.setOnAction(actionEvent -> {
            System.out.println("Button event, playing sound");
            AudioClip plonkSound = new AudioClip("http://www.soundjay.com/mechanical/sounds/clong-1.mp3");
            plonkSound.play();
        });

        Scene scene = new Scene(panel, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
