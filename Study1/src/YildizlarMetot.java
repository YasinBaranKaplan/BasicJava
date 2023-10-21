import java.util.Scanner;

public class YildizlarMetot {
	
	public static void yildizYaz(int sayi) {
		for(int satir = 1; satir<=sayi;satir++) {
			for(int sutun = 1;sutun<=satir;sutun++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
			int girilenecekSayi;
			System.out.println("Bir sayi giriniz.");
			
			girilenecekSayi = input.nextInt();
			
			yildizYaz(girilenecekSayi);
			
			
		}
	}

}
