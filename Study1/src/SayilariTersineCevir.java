import java.util.Scanner;

public class SayilariTersineCevir {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			double[] sayilar =new double[4];
			System.out.println("Dizinin uzunlugu : "+sayilar.length);
			
			for(int i=0;i<sayilar.length;i++) {
				System.out.print(i+1+".sayi => ");
				sayilar[i]=input.nextDouble();
			}
			
			System.out.println("Sayilari tersine cevirirsek :");
			for(int j=sayilar.length-1;j>=0;j--) {
				System.out.print(sayilar[j]+ " ");
			}
			
			
		}
	}

}

