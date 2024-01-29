package com.example.liaotian;

import com.example.liaotian.context.BigModelNew;
import com.example.liaotian.xiancheng.SendThread;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextArea upperTextArea;
    @FXML
    private TextArea lowerTextArea;


    @FXML
     protected void onHelloButtonClick() throws Exception {
        String text = lowerTextArea.getText();
        upperTextArea.appendText("\n" +"我: "+ text);
        upperTextArea.appendText("\n" +"大模型: "+ "思考中.....");
        SendThread thread=new SendThread();
        thread.setText(text);
        thread.start();
        while (BigModelNew.isAnswering){

        }
        upperTextArea.appendText("\n" +"大模型: "+ BigModelNew.totalAnswer);
        lowerTextArea.clear();
    }

    public void openSettings(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("settings.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Settings");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}