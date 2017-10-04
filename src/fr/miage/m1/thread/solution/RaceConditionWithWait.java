package fr.miage.m1.thread.solution;

public class RaceConditionWithWait {
	private static int RUN = 900000;
	
	private int t = 0;
	private int finished = 0;

	public synchronized void inc() {
		t += 1;
	}

	public synchronized void dec() {
		t -= 1;
	}
	
	public synchronized void finished() {
	   this.finished++;
	   notifyAll();
	}
	
	
	public synchronized void waitFinished() {
		while (finished !=2) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("RaceConditionWithWait.waitFinished() Finished!");
	}
	
	

	public static void main(String[] args) {
		RaceConditionWithWait r = new RaceConditionWithWait();
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < RUN; i++) {
					r.inc();
				}
				r.finished();
				System.out.println("RaceConditionWithWait.main() inc finis!");
			}

		}.start();

		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < RUN; i++) {
					r.dec();
				}
				r.finished();
				System.out.println("RaceConditionWithWait.main(...) dec finis");
			}
		}.start();

		r.waitFinished();
		System.out.println("RaceConditionWithWait.main() finished!");
	}
}
