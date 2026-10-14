public class JedliksToyCar {
    int meters = 0;
    int percentage = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        this.percentage = percentage;
        if (this.percentage == 0){
            return "Battery empty";
        }
        String battery = "Battery at " + percentage + "%";
        return battery;
    }
    public void drive() {
        if(this.percentage != 0) {
            this.meters += 20;
            this.percentage--;
        }
    }
}