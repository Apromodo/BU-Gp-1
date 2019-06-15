public class MyThread4 extends Thread {
	public MyThread4(String str) {
		super(str);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + getName());
			try {
				// sleep(1000);
				sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// e.printStackTrace();
			}
		}
		System.out.println("DONE!" + getName());
	}
}

class MyThread4Test {
	public static void main(String[] args) {
		String[] countryArr = { "Turkey", "Germany", "England", "USA" };
		Thread threads[] = new Thread[countryArr.length];
		System.out.println("MyThreadTest started!");
		for (int i = 0; i < countryArr.length; i++) {
			threads[i] = new MyThread4(countryArr[i]);
			threads[i].start();
			// new MyThread(countryArr[i]).start();
		}
		// for(String country : countryArr){
		// new MyThread(country).start();
		// }
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				System.out.println("Thread " + thread.getName());
			}
		}
		System.out.println("MyThreadTest finished!");

	}
}