import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        WatchFile watch = new WatchFile("somefile.txt");
        Thread thread = new Thread(watch);
        thread.start();

        try {
            System.out.println("Press any key to stop watching the file");
            System.in.read();
            watch.stop();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
