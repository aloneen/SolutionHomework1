package kz.seisen.Proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        // Create proxy images
        Image image1 = new ImageProxy("house1.jpg");
        Image image2 = new ImageProxy("house2.jpg");

        // Display thumbnails (fast)
        image1.display();
        image2.display();

        // Display full images (loads only when needed)
        image1.displayFullImage();
        image2.displayFullImage();

        // Protection proxy demo
        ProtectedImageProxy protectedImage = new ProtectedImageProxy("house3.jpg", false);
        protectedImage.uploadImage("new_house.jpg"); // Will fail

        ProtectedImageProxy agentImage = new ProtectedImageProxy("house4.jpg", true);
        agentImage.uploadImage("new_house.jpg"); // Will succeed
    }
}