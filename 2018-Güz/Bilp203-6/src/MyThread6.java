public class MyThread6 extends Thread {
	public MyThread6(String str) {
		super(str);
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + " " + getName());
				// sleep(1000);
				sleep((int) (Math.random() * 1000));
			}
			System.out.println("Done!" + getName());
		} catch (InterruptedException e) {
			System.out.println("Thread " + this.getName() + " interrupted!");
		}
	}

}

class MyThread6Test {
	public static void main(String[] args) {
		String[] countryArr = { "Turkey", "Germany", "England", "USA" };
		Thread threads[] = new Thread[countryArr.length];
		System.out.println("MyThreadTest started!");
		for (int i = 0; i < countryArr.length; i++) {
			threads[i] = new MyThread6(countryArr[i]);
			threads[i].start();
			// new MyThread(countryArr[i]).start();
		}
		// for(String country : countryArr){
		// new MyThread(country).start();
		// }

		try {
			Thread.sleep(5000);
			for (Thread thread : threads) {
				if (thread.isAlive()) {
					System.out.println("Interrupting thread " + thread.getName());
				}
				thread.interrupt();
			}
			for (Thread thread : threads) {
				try {
					thread.join();
				} catch (InterruptedException e) {
					System.out.println("Thread " + thread.getName());
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted!");
		}
		System.out.println("MyThreadTest finished!");

	}
}