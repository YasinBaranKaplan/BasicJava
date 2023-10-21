import java.util.Scanner;

public class DiziKopyalama {
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
			int[] birinci = {6,8,10};
			int[]ikinci =new int[birinci.length];
			
			for(int i=0;i<ikinci.length;i++) {
				ikinci[i]=birinci[i];
			}
			
		}
	}

}
