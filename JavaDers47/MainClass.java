package JavaDers47;

public class MainClass {
	public static void main(String[]args) {
		
		Bilgiler nesne = new Bilgiler();
		
		System.out.println(nesne.isim);
		System.out.println(nesne.sayi);
		System.out.println(nesne.sonuc);
		System.out.println(nesne.ortalama);
		
		nesne.sayi = 500;
		nesne.isim = "Hilal";
		nesne.sonuc = true;
		nesne.ortalama = 0.90f;
		
		System.out.println(nesne.isim);
		System.out.println(nesne.sayi);
		System.out.println(nesne.sonuc);
		System.out.println(nesne.ortalama);
		

		
		
		
		
		
		
		
		
		
	/*	Araba nesne = new Araba();
		
		System.out.println(nesne.hiz);
		System.out.println(nesne.isim);
		
		Araba Audi = new Araba();
		Audi.hiz = 200;
		Audi.isim = "Audi";
		
		System.out.println(Audi.hiz);
		System.out.println(Audi.isim);
		
		Araba Mercedes = new Araba();
		Mercedes.hiz = 300;
		Mercedes.isim = "Mercedes";
		
		System.out.println(Mercedes.hiz);
		System.out.println(Mercedes.isim);
	*/
	}
	

}
