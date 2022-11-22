package JavaDers36;

public class Pratik05 {
//String[]array = {"Hamza","Ali", "Hamza","Ahmet","Ahmet","Ahmet",};
//Yukaridaki array icerisinde hangi ismin kac defa gectigini console'a yazdiran bir program olusturunuz
//Ic ice for dongusu kullanabilirsiniz

	public static void main(String[] args) {
		String bos = "HamzaAliAhmet";
		String[]array = {"Hamza","Ali", "Hamza","Ahmet","Ahmet","Ahmet"};
		 for(int i=0; i<array[i].length(); i++) {
			 if(!bos.contains(array[i])) {
				 for(int j=i+1; j<array.length; j++ ); 
				 if(array[i].equals(array[i])) {
					 
					 
				 }
			 }
			 System.out.println(array[i] + ":" +bos);
			 bos += array[i];
		 }

	}

}
