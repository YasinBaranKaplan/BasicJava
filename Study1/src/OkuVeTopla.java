import java.util.Scanner;
public class OkuVeTopla {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("1. sayi => ");
			
			int sayi1 =input.nextInt();
			
			System.out.print("2.sayi => ");
			
			int sayi2 = input.nextInt();
			int toplam = sayi1+sayi2;
			
			System.out.print("Sayilarin toplami => "+ toplam);
		}
		
		
		
	}

}
