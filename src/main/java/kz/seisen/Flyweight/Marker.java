package kz.seisen.Flyweight;

class Marker {
    private int x;
    private int y;
    private String label;
    private MarkerStyle style;

    public Marker(int x, int y, String label, String iconType, String color, String labelStyle) {
        this.x = x;
        this.y = y;
        this.label = label;
        this.style = MarkerStyleFactory.getMarkerStyle(iconType, color, labelStyle);
    }

    public void display() {
        style.display(x, y, label);
    }
}