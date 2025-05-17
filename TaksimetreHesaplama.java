import java.util.Scanner;

public class TaksimetreHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double start = 10.0;
		double perKM = 2.20;
		
		System.out.print("Lütfen Mesafeyi KM Cinsinden Giriniz : ");
		double KM = scanner.nextDouble();
		
		double price = start + (KM*perKM);
		if (price<20) {
			System.out.println("Toplam Tutar : 20TL" );
		}else {
			System.out.println("Toplam Tutar : " + price + "TL");
		}
	}

}
