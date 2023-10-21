import java.util.Scanner;

public class DiziTopla {
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
			int[] sayilar ;
			sayilar = new int[10];
			
			System.out.println("10 adet sayı giriniz ");
			for(int i=0;i<10;i++) {	
				System.out.print(i+1+".sayi => ");
				sayilar[i]=input.nextInt();
			}
			int toplam = 0;
			for(int i =0;i<10;i++) {
				toplam+=sayilar[i];
			}
			System.out.print("Girdiğiniz değerlerin toplamı = "+toplam);
		}
 }
}


