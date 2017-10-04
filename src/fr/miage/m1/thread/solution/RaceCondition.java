package fr.miage.m1.thread.solution;

public class RaceCondition {
	
	private static int RUN = 900000;
	
	private int t = 0;

	public void inc() {
		t += 1;
	}

	public void dec() {
		t -= 1;
	}

	public static void main(String[] args) {
		RaceCondition r = new RaceCondition();
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < RUN; i++) {
					r.inc();
				}
				System.out.println("RaceCondition.main() inc finis!");
			}

		}.start();

		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < RUN; i++) {
					r.dec();
				}
				System.out.println("RaceCondition.main(...) dec finis");
			}
		}.start();

//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("RaceCondition.main() " + r.t);
	}
}
