package JavaDers42;

public class Pratik01 {
//Parametre olarak gonderilen 2 sayi ile toplama, cikarma, carpma, bolme islemlerinin yapilacagi 4 method olusturun.
	
	public static void main(String[] args) {
		int num3 = 20;
		int num2 = 400;
		toplama(num3, num2);
		cikarma(num3, num2);
		carpma(num2, num3);
		bolme(num2, num3);
	}
	public static void toplama(int sayi1, int sayi2) {
		int toplama = sayi1+sayi2;
		System.out.println("toplama :" + toplama);
	}
	public static void cikarma(int sayi1, int sayi2) {
		int fark = sayi1-sayi2;
		System.out.println("fark :" + fark);
	}
	public static void carpma(int sayi1, int sayi2) {
		int carpim = sayi1*sayi2;
		System.out.println("carpim :" + carpim);
	}
	public static void bolme(int sayi1, int sayi2) {
		int bolum = sayi1/sayi2;
		System.out.println("bolum :" + bolum);
	}
}
