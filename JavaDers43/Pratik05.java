package JavaDers43;

public class Pratik05 {

	public static void main(String[] args) {
		String sifre = "asdKNB.,+965";
	
		System.out.println("sonuc :"+checkPassword(sifre));
	}
	public static boolean checkPassword(String sifre) {
		boolean rakamVarMi = false;
		boolean harfVarMi = false;
		boolean ozelKarakterfVarMi = false;

		
		for(int i=0; i<sifre.length(); i++) {
			if(sifre.charAt(i)>'0' && sifre.charAt(i)<='9') {
				rakamVarMi = true;
			}
			else if(sifre.charAt(i)>='A' && sifre.charAt(i)<='Z') {
				harfVarMi = true;

			}
			else if(sifre.charAt(i)>='a' && sifre.charAt(i)<='z') {
				harfVarMi = true;

			}
			else {
				ozelKarakterfVarMi = true;
			}
		}
		boolean sonuc = ozelKarakterfVarMi && harfVarMi && rakamVarMi;
		return sonuc; 
	}
}
