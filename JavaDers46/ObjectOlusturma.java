package JavaDers46;
// classIsmi nesneIsmi = new ClassIsmi();
public class ObjectOlusturma {

	public static void main(String []args) {
		HesapMakinesi nesne = new HesapMakinesi();
		
		int toplam = nesne.toplama(100, 50);
		int cikarma = nesne.cikarma(70, 50);
		int carpma = nesne.carpma(50, 5);
		int bolme = nesne.bolme(150, 50);

				
		System.out.println("toplama :"+ toplam);
		System.out.println("cikarma :"+ cikarma);
		System.out.println("carpma :"+ carpma);
		System.out.println("bolme :"+ bolme);

		
		
		
	/*
		Ogretmen nesne = new Ogretmen();
		nesne.bilgiYazdir();	
		nesne.brans = "brans";
		nesne.yas = 36;
		nesne.brans = "Kimya";
		
		
		
	/*	Ogrenciler nesne = new Ogrenciler();
		System.out.println("ogrenciSayisi : " + nesne.ogrenciSayisi);
		nesne.kayitEkle();
		nesne.kayitEkle();
		nesne.kayitEkle();
		System.out.println("ogrenciSayisi : " + nesne.ogrenciSayisi);
		nesne.kayitSil();
		nesne.kayitSil();
		System.out.println("ogrenciSayisi : " + nesne.ogrenciSayisi);

	/*
		Araba audi = new Araba();
		System.out.println("Hiz : " + audi.maxHiz);
		System.out.println("Renk : " + audi.renk);
		System.out.println("Vites : " + audi.Vites);
		System.out.println("Model : " + audi.model);
		System.out.println("kapiSayisi : " + audi.kapiSayisi);

		audi.calistir();
		audi.durdur();
		audi.model();
*/
	/*	Kutuphane nesne = new Kutuphane();
		System.out.println(nesne.acilisSaati);
		System.out.println(nesne.kapanisSaaati);
		System.out.println(nesne.kitapSayisi);   */
	}
}
