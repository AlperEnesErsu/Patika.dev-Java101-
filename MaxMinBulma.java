import java.util.Scanner;

public class MaxMinBulma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int max = 0;
		int min = 0;
		
		System.out.print("Kaç sayı gireceksiniz: ");
		int number = scanner.nextInt();

		System.out.print("1. sayıyı giriniz: ");
		int n = scanner.nextInt();
		max = n;
		min = n;

		for (int i = 2; i <= number; i++) {
		    System.out.print(i + ". sayıyı giriniz: ");
		    n = scanner.nextInt();

		    if (n > max) max = n;
		    if (n < min) min = n;
		}
		System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
	}

}
