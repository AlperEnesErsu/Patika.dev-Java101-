import java.util.Scanner;

public class MukemmelSayı {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum =0;
		
		System.out.print("Bir sayı giriniz: ");
		int number = scanner.nextInt();
		
		for(int i = 1; i<number; i++) {
			if (number%i==0) {
				sum += i;
			}
		}
		if (sum==number) {
			System.out.println(number + " Mükemmel sayıdır.");
		}else {
			System.out.println(number + " Mükemmel sayı değildir.");
		}
	}

}
