package JavaDers42;

public class Pratik02 {
//2 tane toplama methodu olusturun.ilk toplama methodu 2 tane tamsayiyi parametre olarak alsin
//ve toplasin. ikinci toplama methodu 3 tane tamsayiyi parametre olarak alsin ve toplasin.	
// .....overloading:Ayni isimde birden fazla method olusturmaya denir
	public static void main(String[] args) {
		toplama(20,30);
		toplama(20,10,40);
	}
	public static void toplama(int sayi1, int sayi2) {
		int toplama = sayi1+sayi2;
		System.out.println("toplama :" + toplama);
	}
	public static void toplama(int sayi1, int sayi2, int sayi3) {
		int toplam = sayi1+sayi2+sayi3;
		System.out.println("toplama :" + toplam);
	}
}
