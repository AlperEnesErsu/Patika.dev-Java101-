import java.util.Scanner;

public class MerkezAçısınınOlçusuVerilenDaireDilimininAlanı {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double pi = Math.PI;
		
		System.out.print("Lütfen Daire Diliminin Yarıçapını Giriniz : ");
		double r = scanner.nextDouble();
		
		System.out.print("Lütfen Daire Diliminin Merkez Açısının Ölçüsünü Giriniz : ");
		double angle = scanner.nextDouble();
		
		double formula = (pi*(r*r)*angle)/360;
		
		System.out.println("Yarıçap Değeriniz : " + r);
		System.out.println("Açı Değeriniz : " + angle);
		System.out.println("Daire Diliminin Alanı : " + formula);
		
	}

}
