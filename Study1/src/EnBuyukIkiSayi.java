import java.util.Scanner;

public class EnBuyukIkiSayi {
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Her satırda ayrı bir tamsayı giriniz.");
			System.out.println("Sonlandırmak için sıfır giriniz.");
			int buyuk1=Integer.MIN_VALUE; int buyuk2 =Integer.MIN_VALUE;
			int sayi = buyuk1;
			
			do 
			{
				if(sayi> buyuk1) {
					buyuk2 = buyuk1;
					buyuk1 = sayi ;
				} else if(sayi > buyuk2) {
					buyuk2 = sayi;
				}
			System.out.print("Sayi => ");
			sayi = input.nextInt();
			} while (sayi!=0);
			
			System.out.println("Girdiğiniz en büyük sayı => "+buyuk1);
			System.out.println("Girdiğiniz en büyük 2, sayı => "+buyuk2);
		}
		
	}

}
