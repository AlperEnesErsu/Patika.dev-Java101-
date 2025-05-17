import java.util.Scanner;

public class SınıfıGeçmeDurumu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Matematik Notunuz : ");
		int matematik = scanner.nextInt();

		System.out.print("Türkçe Notunuz : ");
		int turkce = scanner.nextInt();

		System.out.print("Fizik Notunuz : ");
		int fizik = scanner.nextInt();

		System.out.print("Kimya Notunuz : ");
		int kimya = scanner.nextInt();

		System.out.print("Müzik Notunuz : ");
		int muzik = scanner.nextInt();

		double toplam = (matematik + fizik + kimya + turkce + muzik);
		int toplamDersSayısı = 5;

		if (matematik < 0 || matematik > 100) {
			toplam = toplam - matematik;
			toplamDersSayısı--;
		}

		if (fizik < 0 || fizik > 100) {
			toplam = toplam - fizik;
			toplamDersSayısı--;

		}

		if (kimya < 0 || kimya > 100) {
			toplam = toplam - kimya;
			toplamDersSayısı--;

		}

		if (turkce < 0 || turkce > 100) {
			toplam = toplam - turkce;
			toplamDersSayısı--;

		}

		if (muzik < 0 || muzik > 100) {
			toplam = toplam - muzik;
			toplamDersSayısı--;

		}

		double average = toplam / toplamDersSayısı;
		if (average > 55) {
			System.out.println("Dersten Geçtiniz tebrikler!");
		} else {
			System.out.println("Dersten Kaldınız!");
		}
		System.out.print("Not ortalamanız : " + average);
	}

}
