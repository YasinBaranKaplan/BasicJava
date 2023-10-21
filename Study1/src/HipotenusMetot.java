
public class HipotenusMetot {
	
	static float hipotenus(float ilk,float ikinci) {
		return  (float) ((Math.sqrt((ilk*ilk)+(ikinci*ikinci))));
	}

	public static void main(String[] args) {
		int ilkKenar = 4;
		int ikinciKenar = 3;
		
		System.out.println(hipotenus(ilkKenar,ikinciKenar));
	}
}
