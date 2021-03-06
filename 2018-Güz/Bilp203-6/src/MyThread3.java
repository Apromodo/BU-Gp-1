public class MyThread3 extends Thread {
	public MyThread3(String str) {
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

class MyThread3Test {
	public static void main(String[] args) {
		String[] countryArr = { "Turkey", "Germany", "England", "USA" };
		Thread threads[] = new Thread[countryArr.length];
		// for(int i=0; i<countryArr.length;i++){
		// new MyThread(countryArr[i]).start();
		for (String country : countryArr) {
			new MyThread3(country).start();
		}
	}
}