import java.util.Scanner;

public class HavaSıcaklığınaGöreEtkinlikÖnerme {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sıcaklık Değeri Giriniz : ");
		double temp = scanner.nextDouble();
		
		if (temp < 5) {
			System.out.println("Kayak Yapabilirsiniz!");
		}else if ((temp >= 5)&&(temp <= 15)) {
			System.out.println("Sinemaya Gidebilirsiniz!");	
		}else if ((temp >= 15) && (temp <= 25)) {
			System.out.println("Pikniğe Gidebilirsiniz!");
		}else {
			System.out.println("Yüzmeye Gidebilirsiniz!");
		}

	}

}
