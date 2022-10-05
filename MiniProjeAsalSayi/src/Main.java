
public class Main {
	
	public static void main(String[] args) {
		
		int number = 25;
		boolean asalMi = true;
		
		if (number < 2) {
			System.out.println("Geçersiz sayı.");
			return;
		}
		for(int i = 2; i < number ; i++) {
			if(number % i == 0) {
				asalMi = false;
			
			}
		}
		
		if(asalMi) {
			System.out.println("Sayı asaldır");
		}
		else {
			System.out.println("Sayı asal değildir.");
		}
	}

}
