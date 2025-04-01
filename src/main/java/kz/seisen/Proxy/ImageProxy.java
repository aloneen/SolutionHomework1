package kz.seisen.Proxy;

public class ImageProxy implements Image {
    private String filename;
    private String thumbnail;
    private HighResImage highResImage;

    public ImageProxy(String filename) {
        this.filename = filename;
        this.thumbnail = "thumbnail_" + filename;
    }

    @Override
    public void display() {
        System.out.println("Displaying thumbnail: " + thumbnail);
    }

    @Override
    public void displayFullImage() {
        if (highResImage == null) {
            highResImage = new HighResImage(filename);
        }
        highResImage.displayFullImage();
    }
}
