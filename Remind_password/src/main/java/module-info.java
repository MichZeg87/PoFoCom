module com.example.sktestwithgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.junit.jupiter.params;
    requires io.github.bonigarcia.webdrivermanager;
    requires selenium.api;
    requires selenium.chrome.driver;
    requires selenium.support;
    requires junit;
    requires org.junit.platform.commons;
    requires org.junit.jupiter.api;



    opens com.example.sktestwithgui to javafx.fxml;
    exports com.example.sktestwithgui;
}