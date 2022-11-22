package JavaDers36;

public class ForDongusu {

	public static void main(String[] args) {
	/*	
		for(int i = 0; i<7; i++) {
			System.out.println("merhaba: " +i);
		}
*/
	/*	for(int i = 10; i>1; i--) {
		System.out.println("merhaba: " +i);
		
		}
	*/
	
		String [] isimler= {"Esad", "Veli", "Hilal", "Feride", "Zulal"};
/*	
		for(int i=0; i<isimler.length; i++) {
			System.out.println(isimler[i]);
		}
*/
		for(int i=isimler.length-1; i>=0; i--) {
			System.out.println(isimler[i]);
		}
	}

}
