import java.util.Scanner;

public class GirilenSayıdanKüçükKuvvetleriniBulanProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sınır Sayısını Giriniz: ");
		int n = scanner.nextInt();
		
		System.out.println("-- "+ n + " Sayısına kadar olan ve 4'ün kuvveti olan sayılar: ");
		System.out.println();
		for(int i = 1; i<=n ; i*=4){
			System.out.println(i);
		}
		
		System.out.println("--" + n + " Sayısına kadar olan ve 5'in kuvveti olan sayılar: ");
		System.out.println();
		for(int j = 1; j<=n ; j*=5){
			System.out.println(j);
		}
		
	}

}
