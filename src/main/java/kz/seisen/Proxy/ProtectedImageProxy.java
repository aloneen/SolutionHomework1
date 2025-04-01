package kz.seisen.Proxy;

public class ProtectedImageProxy extends ImageProxy {
    private boolean isAuthenticated;

    public ProtectedImageProxy(String filename, boolean isAuthenticated) {
        super(filename);
        this.isAuthenticated = isAuthenticated;
    }

    public void uploadImage(String newFilename) {
        if (isAuthenticated) {
            System.out.println("Uploading new image: " + newFilename);
        } else {
            System.out.println("Error: Only authenticated agents can upload images");
        }
    }
}