package kz.seisen.Flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight - shared marker styles
public class MarkerStyle {
    private final String iconType;
    private final String color;
    private final String labelStyle;

    public MarkerStyle(String iconType, String color, String labelStyle) {
        this.iconType = iconType;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public void display(int x, int y, String label) {
        System.out.printf("Displaying %s marker at (%d,%d): %s with %s color and %s text%n",
                iconType, x, y, label, color, labelStyle);
    }
}
