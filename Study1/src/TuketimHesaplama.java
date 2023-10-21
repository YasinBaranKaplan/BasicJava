import java.util.Scanner;

public class TuketimHesaplama {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Mesafe => ");
			int mesafe = input.nextInt();
			
			System.out.print("100 kilometrede tüketim => ");
			double birimTüketim = input.nextDouble();
			
			double toplamTüketim = mesafe/birimTüketim;
			
			System.out.println("Tüketim = "+toplamTüketim);
		}
		
		
	}

}
