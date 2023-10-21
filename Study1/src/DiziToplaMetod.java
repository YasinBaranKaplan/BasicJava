
public class DiziToplaMetod {
	
	
	public static int topla(int bir ,int iki ,int uc) {
		int[]dizi = {bir , iki ,uc};
		
		int toplamT = 0;
		
		for(int i = 0 ; i<=2 ; i++) {
			toplamT= toplamT + dizi[i];
		}
		return toplamT;
		
	}
	
	public static void main(String[]args) {
		int toplamM = topla(10,20,30);
		System.out.println(toplamM);
	}
	
	

}
