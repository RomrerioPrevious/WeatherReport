package com.example.weatherReport;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void initialize() {
    }

    @Test
    void getUrlConect() throws IOException {
        StringBuffer conect = new StringBuffer();
        assertEquals(conect.toString(), Controller.getUrlConect("https/api.openweathermap.org/data/2.5/weather?q=Nothing"));
    }

}