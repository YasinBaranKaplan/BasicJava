
public class FahreneitMetot {
	static float fahreneit (float celcius) {
		return ((celcius*(9/5)+32));
	}
	
	static float celcius(float fahreneit) {
		return ((fahreneit-32)*(5/9));
	}
	
	public static void main(String[] args) {
		float cel = 25;
		float fahr = 273;
		
		
		System.out.println(celcius(fahr));
		System.out.println(fahreneit(cel));
	}

}
