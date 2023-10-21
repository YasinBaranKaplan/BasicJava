import java.util.Scanner;

public class OnSayiCarp {
	public static void main(String[]args) {
		try(Scanner input = new Scanner(System.in)){
			int[] sayilar = new int[10];
			System.out.println("10 tane tam sayi giriniz.");
			for(int i=0;i<sayilar.length;i++) {
				System.out.print(i+1+".sayi  => ");
				sayilar[i]=input.nextInt();
			}
			
			
			int carpim=1;
			for(int i=0;i<sayilar.length;i++) {
				carpim=carpim*sayilar[i];
			}
			
			System.out.println("Girilen sayilarin carpimi => "+carpim);
		}
		
	}

}
