import java.util.ArrayList;
import java.util.Collections;

class Takim implements Comparable<Takim>{

    private int id;
    private String isim;


    public Takim(int id, String isim) {
        this.isim=isim;
        this.id=id;
    }

    public String toString() {
        return "  ||" +  "ID : " + id + " Isim : " + isim + "||";

    }

    @Override
    public int compareTo(Takim takim) {

        if(this.id > takim.id) {
            return 1;
        }
        else if(this.id < takim.id) {
            return -1;
        }
        else {
            return 0;
        }


    }

}


public class Main {

    public static void main(String[] args) {

        ArrayList<Takim> list1 = new ArrayList<Takim>();

        Takim o1 = new Takim(5, "Furkan");
        Takim o2 = new Takim(6, "Alp");
        Takim o3 = new Takim(7, "Orhun");
        Takim o4 = new Takim(8, "Kaya");

        list1.add(o1);
        list1.add(o2);
        list1.add(o3);
        list1.add(o4);

        System.out.println(o1.compareTo(o2));

        Collections.sort(list1);
        for(Takim s : list1) {
            System.out.println(s);
        }

    }
}