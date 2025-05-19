import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int facN = 1;
		int facR = 1;
		int facN_R = 1;
		System.out.println("C(n,r) şeklinde ifade edilen kombinasyon için 2 değer giriniz.");
		
		System.out.print("n değerini giriniz : ");
		int n = scanner.nextInt();
		
		System.out.print("r değerini giriniz : ");
		int r = scanner.nextInt();
		
		//Formül için 3 for döngüsü yapacağım:
		//C(n,r) = n!/(r!*(n-r)!)
		for(int i = 1 ; i<=n ; i++){
			facN *= i ;
		}
		
		for(int j = 1 ; j <= r ; j++) {
			facR *= j;
		}
		
		for(int k = 1 ; k<=(n-r) ; k++){
			facN_R *= k;
		}
		double formula = facN/(facR*facN_R);
		System.out.println("Kombinasyon işleminin sonucu : " + formula);
	}

}
