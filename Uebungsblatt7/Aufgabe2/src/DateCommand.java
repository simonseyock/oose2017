import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class DateCommand implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Date date = new Date();
			System.out.println(date.toString());
			try {
				Thread.sleep(ThreadLocalRandom.current().nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
