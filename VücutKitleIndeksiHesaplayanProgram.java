import java.util.Scanner;

public class VücutKitleIndeksiHesaplayanProgram {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz : ");
		double height = scanner.nextDouble();
		
		
		System.out.print("Lütfen Kilonuzu Giriniz : ");
		double weight = scanner.nextDouble();
		
		double formula = weight/(height*height);
		
		System.out.println("Vücut Kitle İndexiniz : " + formula);
		
		
	}
}
