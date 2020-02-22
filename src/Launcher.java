public class Launcher{
    public static void main (String[] args) throws Exception {
        DroneController dc = new DroneController();

        dc.connect("192.168.10.1", 8889);
    }
}
