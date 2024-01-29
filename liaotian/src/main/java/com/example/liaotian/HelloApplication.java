package com.example.liaotian;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static volatile boolean closeWebSocket=false;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 500);
        stage.setTitle("聊天系统");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        closeWebSocket=true;

    }

    public static void main(String[] args) {
        launch();
    }
}