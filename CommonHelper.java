import java.util.concurrent.TimeUnit;

public class CommonHelper {

	
	public static void wait(int numOfSeconds) {
		
		try {
			TimeUnit.SECONDS.sleep(numOfSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}