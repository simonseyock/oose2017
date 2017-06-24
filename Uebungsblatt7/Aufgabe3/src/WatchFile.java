import java.io.File;

public class WatchFile implements Runnable {
    private int intervalMs = 500;
    private File file;
    private boolean stopped = false;

    public void stop() {
        stopped = true;
    }

    public void setInterval(int i) {
        intervalMs = i;
    }

    public WatchFile(File f) {
        file = f;
    }

    public WatchFile(String path) {
        file = new File(path);
    }

    @Override
    public void run() {
        long lastTime = java.lang.System.currentTimeMillis();

        while (!stopped) {
            if (!file.exists()) {
                System.out.println("File does not exist!");
            } else {
                System.out.println("File '" + file.getName() + "' has "
                        + (file.lastModified() >= lastTime ? "" : "not ")
                        + "changed.");
            }
            lastTime = java.lang.System.currentTimeMillis();
            try {
                Thread.sleep(intervalMs);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
