import java.util.Scanner;

public class SifirGirilinceToplamayiKes {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Dilediğiniz kadar tam sayı girin");
			System.out.print("Girişi 0 girerek sonlandırın.");
			int toplam=0;
			int sayi=1;
			while(sayi != 0) {
				System.out.print("Sayı => ");
				sayi=input.nextInt();
				toplam = toplam + sayi;
			}
			System.out.print("Toplam = "+toplam);
		}
	}

}
