package JavaDers43;

public class Pratik03 {

	public static void main(String[] args) {
		int []sayilar = {1,4,555,5,2};
		
		System.out.println(getEnBuyukSayi(sayilar));
	}
	public static int getEnBuyukSayi(int[]sayilar) {
		int enBuyukSayi = Integer.MIN_VALUE;
		for(int i=0; i<sayilar.length; i++) {
			if(sayilar[i]>enBuyukSayi) {
				enBuyukSayi=sayilar[i];
				
		}
	}
		return enBuyukSayi;

	}
	}
	

