package Day6;

class Battery{
    int mahBattery;
    Battery(int mahBattery){
        this.mahBattery = mahBattery;
    }
    void remainBattery(){
        System.out.println("The remainin battery percentage in Mah is :" + " "+ (mahBattery -100)+" "+ "mah");
    }
}

class Camera{
    int pixel;
    Camera(int pixel){
        this.pixel = pixel;
    }
    void takePhoto(){
        System.out.println("Picture captured with " + " "+ pixel + " " + "sensor");
    }
}


class Phone{
    String brand;
    Battery battery;
    Camera camera;

    Phone(String brand,Battery battery , Camera camera){
        this.brand =brand;
        this.battery = battery;
        this.camera = camera;
    }

    void snapPicture(){
        System.out.println("The phone of brand" + " "+ brand + " "+ "is active");
        battery.remainBattery();
        camera.takePhoto();
    }
}
