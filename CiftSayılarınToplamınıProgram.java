import java.util.Scanner;

public class CiftSayılarınToplamınıProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number;
		int sum = 0;
		do {
			System.out.print("Sayı Giriniz : ");
			number = scanner.nextInt();
			
			if ((number%2 == 0) && (number%4 == 0)) {
				sum += number;
			}
		} while (number%2 == 1);
		
		System.out.println("Çift ve 4'ün Katı Olan Sayıların Toplamı : " + sum);

	}

}
