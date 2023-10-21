import java.util.Scanner;

public class MetotlaTopla {
	public static int topla (int sayi1,int sayi2) {
		int toplam = sayi1 + sayi2;
		System.out.print("Sonuc => ");
		return toplam;
	}

	
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Iki adet sayi giriniz.");
			int a , b  ;
			System.out.println("Birinci sayi=> ");
			a = input.nextInt();
			System.out.println("İkinci sayi => ");
			b = input.nextInt();
			
			System.out.println(topla(a,b));
			
		}
		
		
		
	}
}
