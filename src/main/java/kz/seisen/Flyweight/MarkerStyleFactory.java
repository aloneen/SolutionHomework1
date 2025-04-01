package kz.seisen.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getMarkerStyle(String iconType, String color, String labelStyle) {
        String key = iconType + color + labelStyle;
        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(iconType, color, labelStyle));
            System.out.println("Creating new marker style: " + key);
        }
        return styles.get(key);
    }

    public static int getStyleCount() {
        return styles.size();
    }
}