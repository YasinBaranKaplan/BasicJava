import java.util.Scanner;

public class FaktoriyelMetot {
	
	static int faktoriyel(int sayi) {
		int sonuc = 1;
		while(sayi!=0) {
			sonuc = sonuc*sayi;
			sayi-- ;
		}
		
		return sonuc;
	}
	
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
			int faktor;
			System.out.print("Faktoriyel alınacak sayıyı giriniz => ");
			
			faktor = input.nextInt();
			
			System.out.println("Girilen degerin faktoriyeli => "+faktoriyel(faktor));
			
			
		
		}
		
	}

}
