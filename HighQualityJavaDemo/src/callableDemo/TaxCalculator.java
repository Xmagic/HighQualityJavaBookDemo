package callableDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TaxCalculator implements Callable<Integer>{

	private int seedMoney;
	
	public TaxCalculator(int money) {
		seedMoney = money;
	}
	
	@Override
	public Integer call() throws Exception {
		//Cost 10s to calculate
		TimeUnit.MILLISECONDS.sleep(10000);
		return seedMoney/10;
	}

}
