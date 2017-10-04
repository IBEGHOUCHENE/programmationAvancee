package fr.miage.m1.thread.solution;

public class RaceConditionSynchronized {
	
	private static int RUN = 900000;
	
	private int t = 0;

	public synchronized void inc() {
		t += 1;
	}

	public synchronized void dec() {
		t -= 1;
	}

	public static void main(String[] args) {
		RaceConditionSynchronized r = new RaceConditionSynchronized();
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < RUN; i++) {
					r.inc();
				}
				System.out.println("RaceConditionSynchronized.main() inc finis!");
			}

		}.start();

		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < RUN; i++) {
					r.dec();
				}
				System.out.println("RaceConditionSynchronized.main(...) dec finis");
			}
		}.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("RaceConditionSynchronized.main() " + r.t);
	}
}
