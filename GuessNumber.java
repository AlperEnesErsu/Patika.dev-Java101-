import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);

		int number = rand.nextInt(100);

		int right = 0;
		int selected;
		int[] wrong = new int[5];
		boolean isWin = false;
		boolean isWrong = false;

		while (right < 5) {
			System.out.print("Lütfen tahmininizi giriniz: ");
			selected = scanner.nextInt();
			if (selected < 0 || selected > 99) {
				System.out.print("Lütfen 0 ile 99 arasında değer giriniz");

				if (isWrong) {
					right++;
					System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
				} else {
					isWrong = true;
					System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
				}
				continue;
			}
			if (selected == number) {
				System.out.print("Tebrikler Doğru Tahmin! Tahmin ettiğiniz sayı : " + selected);
				isWin = true;
				break;
			} else {
				System.out.println("Hatalı bir sayı girdiniz !");
				if (selected > number) {
					System.out.print(selected + " sayısı gizli sayıdan büyüktür.");
				} else {
					System.out.print(selected + " sayısı gizli sayıdan küçüktür.");
				}

				wrong[right] = selected;
				right++;
				System.out.println("Kalan hakkınız : " + (5 - right));
			}

		}

		if (!isWin) {
			System.out.println("Kaybettiniz!");
			if (!isWrong) {
				System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
			}
		}

	}

}
