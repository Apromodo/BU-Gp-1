public class HesapBilgisi {

private String ad;
private String soyad;

public HesapBilgisi(String ad,String soyad){
this.ad=ad;
this.soyad=soyad;
}

public class HesapBilgisiHelper{
public void IsımYaz(){
System.out.println(ad);
}
public void SoyadYaz(){
System.out.println(soyad);
}
}

}
