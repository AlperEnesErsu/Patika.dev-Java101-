import java.util.Scanner;

public class workSpace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int mat, fizik, kimya, turkce, tarih, muzik;

		System.out.println("Matematik Notunuz : ");
		mat = input.nextInt();
		
		System.out.println("Fizik Notunuz : ");
		fizik = input.nextInt();
		
		System.out.println("Kimya Notunuz : ");
		kimya = input.nextInt();
		
		System.out.println("Türkçe Notunuz : ");
		turkce = input.nextInt();
		
		System.out.println("Tarih Notunuz : ");
		tarih = input.nextInt();
		
		System.out.println("Müzik Notunuz : ");
		muzik = input.nextInt();
		
		double ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;
		System.out.println("Ortalamanız : " +ortalama);
		
		if (ortalama>=60) {
			System.out.println("Dersten Geçtiniz!");
		}else {
			System.out.println("Dersten Kaldınız");
		}
	}

}
