package kz.seisen.Flyweight;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        // Create many markers with shared styles
        Marker[] markers = new Marker[10];

        // First 5 are gas stations
        for (int i = 0; i < 5; i++) {
            markers[i] = new Marker(i*10, i*10, "Gas Station " + i,
                    "gas", "red", "bold");
        }

        // Next 3 are restaurants
        for (int i = 5; i < 8; i++) {
            markers[i] = new Marker(i*10, i*10, "Restaurant " + i,
                    "restaurant", "blue", "italic");
        }

        // Last 2 are hospitals
        for (int i = 8; i < 10; i++) {
            markers[i] = new Marker(i*10, i*10, "Hospital " + i,
                    "hospital", "green", "normal");
        }

        // Display all markers
        for (Marker marker : markers) {
            marker.display();
        }

        // Show memory savings
        System.out.println("\nTotal markers created: " + markers.length);
        System.out.println("Unique marker styles created: " + MarkerStyleFactory.getStyleCount());
        System.out.println("Memory savings: " + (markers.length - MarkerStyleFactory.getStyleCount()) +
                " style objects saved");
    }
}