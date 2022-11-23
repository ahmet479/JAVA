package JavaDers43;

public class Pratik02 {

	public static void main(String[] args) {
/*
		int sonuc = 1;
		
		for(int i=1; i<=6; i++) {
			sonuc *= i;
		}
		System.out.println("sonuc :"+ sonuc);
*/
		int sayi = 20;
		System.out.println(sayi+"!="+getFaktoryel(sayi));
	}
	public static long getFaktoryel(int sayi) {
		long sonuc = 1;
		
		for(int i=1; i<=sayi; i++) {
			sonuc *= i;
		}
		return sonuc;
	}
}
