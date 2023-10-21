import java.util.Scanner;

public class TamSayiTersCevir {
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
			int sayi , sonBasamak, tersi = 0;
			System.out.print("Tamsayı => ");
			sayi = input.nextInt();
			
			do {
				sonBasamak = sayi%10;
				tersi = (tersi*10)+sonBasamak;
				sayi = sayi/10;
			}while(sayi>0);
			
			System.out.print("Girilen sayinin tersi = "+tersi);
			
		}
	}

}
