import java.util.Scanner;

public class OkumaVeOrtalama {
	public static void main(String[] args) {
	try (Scanner input = new Scanner(System.in)) {
		System.out.println("1.sayiyi giriniz");
		float sayi1 = input.nextFloat();
		System.out.println("2.sayiyi giriniz");
		float sayi2 = input.nextFloat();
		System.out.println("ortalamasi = "+ (sayi1+sayi2)/2);
	}
		}
	}


