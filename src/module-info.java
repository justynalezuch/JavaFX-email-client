module FirstJavaFX {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;

    opens com.emailClient;
    opens com.emailClient.view;
    opens com.emailClient.controller;
}