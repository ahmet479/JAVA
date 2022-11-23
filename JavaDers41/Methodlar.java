package JavaDers41;

public class Methodlar {
/* ***Alt programlar yardimiyla programi daha anlasilir ve gelistirilebilir hale getirmek.
 1.Parametresiz
 2.Parametreli    */
	public static void main(String[] args) {

		System.out.println(arrayToplam(new int [] {10,20,30,40}));
		System.out.println(arrayToplam(new int[] {2,5,9,10}));
		System.out.println(arrayToplam(new int[] {42,5,50,10}));
     
	}
	public static int arrayToplam(int[]sayilar) {
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam+= sayi;
		}
		return toplam;
	}
}
