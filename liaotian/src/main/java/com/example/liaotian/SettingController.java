package com.example.liaotian;

import com.example.liaotian.context.BigModelNew;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SettingController {

    public String appid = "";
    public String apiSecret = "";
    public String apiKey = "";

    @FXML
    TextField Field01;
    @FXML
    TextField Field02;
    @FXML
    TextField Field03;

    @FXML
    public void Go(ActionEvent actionEvent) {
        appid= Field01.getText();
        apiSecret=Field02.getText();
        apiKey=Field03.getText();
        BigModelNew.setApiKey(apiKey);
        BigModelNew.setAppid(appid);
        BigModelNew.setApiSecret(apiSecret);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }
}
