package kz.seisen.Proxy;

public class HighResImage implements Image {
    private String filename;

    public HighResImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading high-res image: " + filename);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying high-res image: " + filename);
    }

    @Override
    public void displayFullImage() {
        display();
    }
}
