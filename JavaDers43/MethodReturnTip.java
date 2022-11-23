package JavaDers43;

public class MethodReturnTip {
// void: Deger dondurmez
	public static void main(String[] args) {
		bilgiGoster();
		int sonuc = toplam(20,30);
		System.out.println(sonuc);
	}

	public static void bilgiGoster() {
	System.out.println("merhabalar.");	
	System.out.println("selamlar.");
	}
	public static int toplam(int sayi1, int sayi2) {
		int toplam = sayi1+ sayi2;
		
		return toplam;
	}
}
