import java.util.Scanner;

public class ÜslüSayıHesaplayanProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long total = 1;
		
		System.out.print("Üssü alınacak sayı : ");
		int n = scanner.nextInt();
		
		System.out.print("Üs olacak sayı : ");
		int k = scanner.nextInt();
		
		for (int j = 1 ; j<=k; j++){
			total *= n;
		}
		
		System.out.println("Cevap : " + total);
	}

}
