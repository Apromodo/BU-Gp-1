public class MyThread extends Thread {
public MyThread(String str) {
super(str);

}

public void run() {

for (int i = 0; i < 10; i++) {



System.out.println(i + " " + getName());
try {
sleep((int)(Math.random()*1000));
//sleep(1000);
} catch (InterruptedException e) {

}

}
System.out.println("DONE!"+getName());
}

}

class MyThreadTest {



//fasted down
/*String[]countryArr = {"Turkey","Germany","USA","ENGLAND"};
for(String country:countyrArr) {
new MyThread(countryArr[i]).start();
}
*/
//-------------------------------------------------
public static void main(String[] args) {
String[]countryArr = {"Turkey","Germany","USA","ENGLAND"};
Thread threads[]=new Thread[countryArr.length];
System.out.println("mythreadtest started"); 
for(int i=0;i<countryArr.length;i++) {
new MyThread(countryArr[i]).start();
}
for(int i=0; i < threads.length; i++) {

}
System.out.println("mythread test finised");

}

//_---------------------------------------

/*	public static void main(String[] args) {
new MyThread("Turkey").start();
new MyThread("Germany").start();
}
*/
}