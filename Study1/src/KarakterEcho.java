import java.io.IOException;

public class KarakterEcho {
	public static void main(String[]args) throws IOException {
		System.out.print("Sayı => ");
		int sayi = 0;
		int c;
		
		while( (c= System.in.read())!='\n') {
			if((c>='0')&&(c<='9')) {
				sayi = sayi*10;
				sayi += (c-'0');
				System.out.println("Sayı = "+sayi);
			}
			
		}
		
	}

}
