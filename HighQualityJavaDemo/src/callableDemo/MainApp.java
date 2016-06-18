package callableDemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class MainApp {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService exeService = Executors.newSingleThreadExecutor();
		try {
			System.out.println("Task start!");
			Future<Integer> future = exeService.submit(new TaxCalculator(9999));
			while (!future.isDone()) {
				// The future task not done, sleep a while to wait.
				TimeUnit.MILLISECONDS.sleep(1000);
				System.out.print("#");
			}
			System.out.println();
			System.out.println("Calculation Done! The result is : " + future.get());

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			exeService.shutdown();
		}
	}
}
