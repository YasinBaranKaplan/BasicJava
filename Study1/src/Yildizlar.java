import java.util.Scanner;

public class Yildizlar {
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Satır sayısını giriniz => ");
			System.out.print("Hesaplama yapılıyor ");
			int sayi = input.nextInt();
			
				for(int satir = 1;satir<=sayi;satir++) {
					for(int sutun = 1;sutun<=satir;sutun++) {
						System.out.print("*");
					}
					System.out.print("\n");
				}
		}
				
	}
}
