package JavaDers36;

public class Pratik02 {
// 20'den 120'ye kadar 3'le tam bolunebilen sayilari console'a 
//yazan bir program olusturunuz.
// For dongusu kullaniniz.

	public static void main(String[] args) {
		int []sayilar = {20,20};
		for(int i=20; i<120; i++) {
			
			if(i %3==0) {
				System.out.println(i);
				
			}
		}
		
	}

}
