import java.util.Scanner;

public class ArtıkYılHesaplama {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Yıl Giriniz : ");
		int year = scanner.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			System.out.println(year + " bir artık yıldır !");
		}else {
			System.out.println(year + " bir artık yıl değildir !");
		}
	}

}
