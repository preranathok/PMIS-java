package Day6;

public class Example3Main {
    public static void main(String[] args) {
        Battery b = new Battery(250);
        Camera cm  = new Camera(100);
        Phone realme = new Phone("Realme P1",b,cm);
        realme.snapPicture();
    }
}
