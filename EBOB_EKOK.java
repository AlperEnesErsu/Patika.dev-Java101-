import java.util.Scanner;

public class EBOB_EKOK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 1;
		int j = 1;
		int ebob = 0;

		System.out.print("1. Sayıyı Giriniz : ");
		int n1 = scanner.nextInt();

		System.out.print("2. Sayıyı Giriniz : ");
		int n2 = scanner.nextInt();

		while ((i <= n1) && (i <= n2)) {
			if ((n1 % i == 0) && (n2 % i == 0)) {
				ebob = i;
			}
			i++;
		}

		System.out.println(n1 + " ve " + n2 + " sayılarının ebobu : " + ebob);

		int ekok = (n1 * n2) / ebob;
		System.out.println(n1 + " ve " + n2 + " sayılarının ekoku : " + ekok);
	}
}
