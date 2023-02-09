package com.example.weatherReport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private Text date;

    @FXML
    private URL location;

    @FXML
    private Text humidity;

    @FXML
    private Button nextDay;

    @FXML
    private Button getWeather;

    @FXML
    private Button previousDay;

    @FXML
    private TextField region;

    @FXML
    private Text temperature;

    @FXML
    private Text weather;


    @FXML
    void initialize() {
        String API = "ba2f1756601e9944b7c27187b8db7aa4";
        date.setText("04.02.23");
        getWeather.setOnAction(event -> {
            String reg = region.getText();
            String output = null;
            String url = "https://api.openweathermap.org/data/2.5/weather?q="+ reg +"&appid=" + API;
            try {
                output = getUrlConect(url);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println(output);
        });
    }

    public static String getUrlConect(String urlAdres) throws IOException {
        StringBuffer conect = new StringBuffer();

        try {
            URL url = new URL(urlAdres);
            URLConnection urlConnection = url.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;

            while ((line = bufferedReader.readLine()) != null){
                conect.append(line).append("\n");
            }
            bufferedReader.close();
        }
        catch (Exception e){
            System.out.println("Нет города");
        }

        return conect.toString();
    }
}
