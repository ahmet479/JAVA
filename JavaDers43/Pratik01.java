package JavaDers43;

public class Pratik01 {
/*	return tipi "int" olan ve kendisine gonderilen 2 tamsayi prametresini
	kullanarak islem yapan asagidaki isimlerlerde 4 tane method olusturun.
	toplama(int sayi1, int sayi2)         return tip:
	cikarma(int sayi1, int sayi2)         void --->sadece islem yapar
	carpma(int sayi1, int sayi2)          int ---->islemin sonucunu
	bolme(int sayi1, int sayi2)           return etmek zorunda
*/
	public static void main(String[] args) {
		int sonuc1 = toplama(20,10);
		int sonuc2 = cikarma(20,10);
		int sonuc3 = carpma(20,10);
		int sonuc4 = bolme(20,10);
		System.out.println("toplam :" +sonuc1);
		System.out.println("fark :" +sonuc2);
		System.out.println("carpim :"+sonuc3);
		System.out.println("bolum :"+sonuc4);

	}
	public static int toplama(int sayi1, int sayi2) {
			int toplam = sayi1+ sayi2;
			
			return toplam;
		}
	public static int cikarma(int sayi1, int sayi2) {
		int fark = sayi1- sayi2;
		
		return fark;
	}
	public static int carpma(int sayi1, int sayi2) {
		int carpim = sayi1*sayi2;
		return carpim;
	}

	public static int bolme(int sayi1, int sayi2) {
		int bolum = sayi1/sayi2;
		
		return bolum;
	}
}
