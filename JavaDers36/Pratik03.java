package JavaDers36;

public class Pratik03 {
//For dongusu kullanarak bir sayinin karekokunu hesaplayan bir program yaziniz.

	public static void main(String[] args) {	
//	System.out.println(Math.sqrt(9));
	//  1.000*1.000 = 9  > o zaman 1.000 aradigim karekoktur	
	//  1.001*1.001 = 9  > o zaman 1.001 aradigim karekoktur	
	//  1.002*1.002 = 9  > o zaman 1.002 aradigim karekoktur	
	//  1.003*1.003 = 9  > o zaman 1.003 aradigim karekoktur	
	//  1.004*1.004 = 9  > o zaman 1.004 aradigim karekoktur	
	//  .....	
	//  .....
	//  3.000*3.000 = 9  > o zaman 3.00 aradigim karekoktur	
		int sayi        = 36;
		double karekok  = 1;
		for(double i=1000; i*i <=sayi; i+=0.01) {
		karekok = i;
	}
		String format = String.format("%.5f", karekok);
	
	System.out.println(format);
	}
}
