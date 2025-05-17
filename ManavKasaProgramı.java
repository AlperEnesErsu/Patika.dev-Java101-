import java.util.Scanner;

public class ManavKasaProgramı {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double Armut = 2.14;
		double Elma = 3.67;
		double Domates = 1.11;
		double Muz = 0.95;
		double Patlıcan = 5.00;
		
		System.out.print("Armut Kaç Kilo ? : ");
		double k1 = scanner.nextDouble();
		
		System.out.print("Elma Kaç Kilo ? : ");
		double k2 = scanner.nextDouble();	
		
		System.out.print("Domates Kaç Kilo ? : ");
		double k3 = scanner.nextDouble();	
		
		System.out.print("Muz Kaç Kilo ? : ");
		double k4 = scanner.nextDouble();	
		
		System.out.print("Patlıcan Kaç Kilo ? : ");
		double k5 = scanner.nextDouble();	
		
		double totalCost = (Armut*k1)+(Elma*k2)+(Domates*k3)+(Muz*k4)+(Patlıcan*k5);
		
		System.out.print("Toplam Tutar : " + totalCost + " TL");
		
	}

}
