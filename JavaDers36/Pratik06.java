package JavaDers36;

public class Pratik06 {
//String[]array={"Ali", "Esad","Emine","Esad","Emine","Emine"};
//Yukaridaki icerisinde "Emine" isminin var olup olmadigini dogrulayan bir program yaziniz
//break : Donguyu sona erdirir.       flag -->

	public static void main(String[] args) {
		
		String[]array={"Ali", "Esad","Emine","Esad","Emine","Emine"};
		String kelime = "Esad";
	/*	
		for(int i=0; i<array.length; i++) {
			
			if(array[i].equals(kelime)) {
				System.out.println("Evet var.");
				break;		
			}		
		}
	*/
		boolean iceriyorMu = false;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i].equals(kelime)) {
				
				iceriyorMu = true;
				break;
			}
		}
		if(iceriyorMu) {
			System.out.println("Evet...");
		}else {
			System.out.println("Yok..");
		}
	}

}
