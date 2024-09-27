public class HomeApp {
    public static void main(String[] args) {
        HomeInterface homeInterface = new HomeInterface();

        // Turning on all services
        homeInterface.turnOnAll();

        // Turning off all services
        homeInterface.turnOffAll();
    }
}
