package fr.miage.m1.thread.solution;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceConditionAtomic {

	private static int RUN = 900000;
	
	
	private AtomicInteger t = new AtomicInteger(0);

	public synchronized void inc() {
		t.incrementAndGet();
	}

	public synchronized void dec() {
		t.decrementAndGet();
	}

	public static void main(String[] args) {
		RaceConditionAtomic r = new RaceConditionAtomic();
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < RUN; i++) {
					r.inc();
				}
				System.out.println("RaceConditionAtomic.main() inc finis!");
			}

		}.start();

		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < RUN; i++) {
					r.dec();
				}
				System.out.println("RaceConditionAtomic.main(...) dec finis");
			}
		}.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("RaceConditionAtomic.main() " + r.t);
	}
}
