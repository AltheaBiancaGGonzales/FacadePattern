import java.util.ArrayList;
import java.util.List;

public class HomeInterface {
    private List<HomeService> services;

    public HomeInterface() {
        services = new ArrayList<>();
        services.add(new Light());
        services.add(new TV());
        services.add(new AirConditioning());
    }

    public void turnOnAll() {
        for (HomeService service : services) {
            service.turnOn();
        }
    }

    public void turnOffAll() {
        for (HomeService service : services) {
            service.turnOff();
        }
    }
}

