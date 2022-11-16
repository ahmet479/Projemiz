package JavaDers15;

public class Pratin01 {

	public static void main(String[] args) {
		String ad ="Ahmet";
		String soyAd= "Toprak";
		
		//String klavye = ad+ " " + soyAd;

		String klavye = ad.concat(soyAd);
		System.out.println(klavye);
		
		System.out.println("uzunluk:" + klavye.length());

	}

}
