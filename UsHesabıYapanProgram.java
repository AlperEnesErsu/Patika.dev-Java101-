import java.util.Scanner;

public class UsHesabıYapanProgram {
	
	public static int power(int a,int b) {
		
		if (b==0) {
			return 1;
		}
		return a*power(a, b-1);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Taban değerini giriniz : ");
		int a = scanner.nextInt();
		
		System.out.println("Üs değerini giriniz");
		int b = scanner.nextInt();
		power(a, b);
	}

}
