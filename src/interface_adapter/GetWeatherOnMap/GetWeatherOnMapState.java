package interface_adapter.GetWeatherOnMap;

import javax.swing.*;

public class GetWeatherOnMapState {
    private double centerLatitude;
    private double centerLongitude;

    private JPanel mapPanel;

    // Constructor
    public GetWeatherOnMapState() {
        // Initialize with default center and zoom level for the map
        this.centerLatitude = 0.0;  // Default latitude (equator)
        this.centerLongitude = 0.0; // Default longitude (Greenwich)

    }

    // Getters and setters
    public double getCenterLatitude() {
        return centerLatitude;
    }

    public void setCenterLatitude(double centerLatitude) {
        this.centerLatitude = centerLatitude;
    }

    public double getCenterLongitude() {
        return centerLongitude;
    }

    public void setCenterLongitude(double centerLongitude) {
        this.centerLongitude = centerLongitude;
    }

    public JPanel getMapPanel() {
        return mapPanel;
    }

    public void setMapPanel(JPanel mapPanel) {
        this.mapPanel = mapPanel;
    }

}
