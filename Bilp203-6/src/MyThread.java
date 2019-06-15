public class MyThread extends Thread {
	public MyThread(String str) {
		super(str);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + getName());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// e.printStackTrace();
			}
		}
		System.out.println("DONE!" + getName());
	}
}

class MyThreadTest {
	public static void main(String[] args) {
		new MyThread("Turkey").start();
		new MyThread("Germany").start();
	}
}