import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Lütfen Bir Sayı Giriniz : ");
		int number = scanner.nextInt();
		
		int result = 0;
		int basValue = 0;
		
		while(number !=0){
			basValue = number % 10;
			result += basValue;
			number /= 10;
		}

		System.out.println("Basamaklar Toplamı : " + result);
	}

}
