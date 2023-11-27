package use_case.get_weather_on_map;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;

public class WebPanel {

    public static JPanel createWebPanel(String pageURL) {
        final JFXPanel jfxPanel = new JFXPanel();

        Platform.runLater(() -> {
            WebView webView = new WebView();
            jfxPanel.setScene(new Scene(webView));
            webView.getEngine().load(pageURL);
        });

//        WebView webView = new WebView();
//        webView.getEngine().load(pageURL);
//        jfxPanel.setScene(new Scene(webView));

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(jfxPanel, BorderLayout.CENTER);

        return panel;
    }

    public static void main(String[] args) {
        // Ensures the JavaFX runtime is initialized
        Platform.startup(() -> {});

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("URL Viewer");
//            JPanel webPanel = createWebPanel("https://www.google.com/maps");
            JPanel webPanel = createWebPanel("file:///Users/williammeng/Desktop/CSC207/IdeaProjects/WeatherWeavers2/src/use_case/get_weather_on_map/mapPage.html");
            frame.add(webPanel);
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

