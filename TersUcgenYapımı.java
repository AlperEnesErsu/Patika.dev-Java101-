import java.util.Scanner;

public class TersUcgenYapımı {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Basamak Sayısı : ");
		int number = scanner.nextInt();

		for (int i = number; i >= 1; i--) {

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

	}

}
