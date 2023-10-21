import java.util.Scanner;

public class KontrollüKesirliSayi {
	public static void main(String[] args ) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Pay => ");
			float pay = input.nextFloat();
			
			System.out.print("Payda => ");
			float payda = input.nextFloat();
			
			
			if( payda != 0 ) {
				float sonuc =pay/payda;
				System.out.print("Pay/Payda = "+sonuc);
			}
		}
			
		
	}

}
