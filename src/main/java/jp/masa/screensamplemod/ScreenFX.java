package jp.masa.screensamplemod;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ScreenFX extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("JavaFX Screen");
        stage.setWidth(500);
        stage.setHeight(500);
        stage.show();

    }

    public ScreenFX() {

    }
}
