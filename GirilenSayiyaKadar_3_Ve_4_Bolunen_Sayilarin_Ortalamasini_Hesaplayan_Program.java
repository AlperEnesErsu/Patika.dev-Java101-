import java.util.Scanner;

public class GirilenSayiyaKadar_3_Ve_4_Bolunen_Sayilarin_Ortalamasini_Hesaplayan_Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Sayı Giriniz : ");
		int number = scanner.nextInt();

		int sum = 0;
		int totalNumber = 0;
		for (int i = 1; i <= number; i++) {
			if ((i % 3 == 0) && (i % 4 == 0)) {
				sum += i;
				totalNumber++;
			}
		}
		if (totalNumber > 0) {
			double formula = (double) sum / totalNumber;
			System.out.println("0'dan " + number
					+ " sayısına kadar olan ve 3 ve 4 e tam bölünen sayıların ortalaması : " + formula);
		} else {
			System.out.println("3 ve 4'e tam bölünen bir sayı bulunamadı.");
		}

	}

}
