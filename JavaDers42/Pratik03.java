package JavaDers42;

public class Pratik03 {

	public static void main(String[]args) {		
		int []sayilar  = {20, 4, 54, 2};
		int arananSayi = 20;
		
		kontrol(sayilar, arananSayi);
	
		int []sayilar1  = {20, 4, 54, 2};
		int arananSayi1 = 30;
		kontrol(sayilar1, arananSayi1);
		}
	public static void kontrol(int[]array, int arananSayi){
	
	boolean varMi=false;
	
	for(int sayi:array) {
		if(sayi==arananSayi) {
			varMi=true; 
				break;
		}
		}
		System.out.println("var mi? :" +varMi);
	}
}
