
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ucgen u1 = new Ucgen(2, 3, 4, "Ucgen A");
		Ucgen u2 = new Ucgen();

		u2.setKenar1(3);
		u2.setKenar2(5);
		u2.setKenar3(8);
		u2.setAd("Ucgen B");

		Yazdir(u1);
		Yazdir(u2);

	}

	public static void Yazdir(Ucgen u2) {
		System.out.println(u2.getKenar1());
	}

}
