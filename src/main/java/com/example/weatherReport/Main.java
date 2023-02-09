package com.example.weatherReport;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("WeatherReport.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 500);
        stage.setTitle("Погода");
        stage.getIcons().add(new Image("D:\\Save\\Weather_report\\WeatherReport\\src\\main\\resources\\rain.png"));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}