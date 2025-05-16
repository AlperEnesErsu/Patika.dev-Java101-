import java.util.Scanner;

public class AlanHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Üçgenin 1. kenar uzunluğunu giriniz : ");
		int k1 = scanner.nextInt();

		System.out.print("Üçgenin 2. kenar uzunluğunu giriniz : ");
		int k2 = scanner.nextInt();

		System.out.print("Üçgenin 3. kenar uzunluğunu giriniz : ");
		int k3 = scanner.nextInt();

		if ((k1 + k2 > k3) && (k1 + k3 > k2) && (k2 + k3 > k1)) {

			double u = (k1 + k2 + k3) / 2.0;

			double alan = Math.sqrt(u * (u - k1) * (u - k2) * (u - k3));

			System.out.println("Üçgenin alanı :" + alan);

		} else if ((k1 <= 0) || (k2 <= 0) || (k3 <= 0)) {

			System.out.println("Üçgenin kenarları pozitif tam sayı olmalıdır.");
			
		} else {
			
			System.out.println("Girdiğiniz verilerden üçgen elde edilemiyor lütfen tekrar deneyiniz. ");
			
		}
	}

}
