import java.util.Scanner;

public class NotRaporu {
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Notunuzu Giriniz (1-100)");
			int not = input.nextInt();
			
			int basari = not/10;
			System.out.print("Değerlendirme Sonucu => ");
			
			switch(basari) {
			case 10 :
			case 9 :
			case 8 :System.out.println("Çok iyi");
					break;
			case 7 :System.out.println("İyi");
					break;
			case 6 : System.out.println("Orta");
			 		break;
			default :System.out.println("Henüz değil");
			 		break;
			}	
		}
	}
}
