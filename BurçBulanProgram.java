import java.util.Scanner;

public class BurçBulanProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen Doğduğunuz Ayı Yazınız : ");
		String month = scanner.nextLine();
		month = month.toLowerCase();
		System.out.print("Lütfen Doğduğunuz Günü Giriniz : ");
		int day = scanner.nextInt();
		
		
		if (month.equals("ocak")) {
			
			if ((day>=1)&&(day<=21)) {
				System.out.println("Burcunuz Oğlak");
			}else if (day<=31) {
				System.out.println("Burcunuz Kova");
			}else {
				System.out.println("Girdiğiniz Gün Verisi Geçersizdir!");
			}
			
		}else if (month.equals("şubat")) {
			
			if ((day>=1)&&(day<=19)) {
				System.out.println("Burcunuz Kova");
			}else if (day<=28) {
				System.out.println("Burcunuz Balık");
			}else {
				System.out.println("Girdiğiniz Gün Verisi Geçersizdir!");
			}
			
		}else if (month.equals("mart")) {
			
			if ((day>=1)&&(day<=20)) {
				System.out.println("Burcunuz Balık");
			}else if (day<=31) {
				System.out.println("Burcunuz Koç");
			}else {
				System.out.println("Girdiğiniz Gün Verisi Geçersizdir!");
			}
			
		}else if (month.equals("nisan")) {
			
			if ((day>=1)&&(day<=20)) {
				System.out.println("Burcunuz Koç");
			}else if (day<=30) {
				System.out.println("Burcunuz Boğa");
			}else {
				System.out.println("Girdiğiniz Gün Verisi Geçersizdir!");
			}
			
		}else if (month.equals("mayıs")) {
			
			if ((day>=1)&&(day<=21)) {
				System.out.println("Burcunuz Boğa");
			}else if (day<=31) {
				System.out.println("Burcunuz İkizler");
			}else {
				System.out.println("Girdiğiniz Gün Verisi Geçersizdir!");
			}
			
		}else if (month.equals("haziran")) {
			
			if ((day>=1)&&(day<=22)) {
				System.out.println("Burcunuz İkizler");
			}else if (day<=30) {
				System.out.println("Burcunuz Yengeç");
			}else {
				System.out.println("Girdiğiniz Gün Verisi Geçersizdir!");
			}
			
		}else if (month.equals("temmuz")) {
			
			if ((day>=1)&&(day<=22)) {
				System.out.println("Burcunuz Yengeç");
			}else if (day<=31) {
				System.out.println("Burcunuz Aslan");
			}else {
				System.out.println("Girdiğiniz Gün Verisi Geçersizdir!");
			}
			
		}else if (month.equals("ağustos")) {
			
			if ((day>=1)&&(day<=22)) {
				System.out.println("Burcunuz Aslan");
			}else if (day<=31) {
				System.out.println("Burcunuz Başak");
			}else {
				System.out.println("Girdiğiniz Gün Verisi Geçersizdir!");
			}
			
		}else if (month.equals("eylül")) {
			
			if ((day>=1)&&(day<=22)) {
				System.out.println("Burcunuz Başak");
			}else if (day<=30) {
				System.out.println("Burcunuz Terazi");
			}else {
				System.out.println("Girdiğiniz Gün Verisi Geçersizdir!");
			}
			
		}else if (month.equals("ekim")) {
			
			if ((day>=1)&&(day<=22)) {
				System.out.println("Burcunuz Terazi");
			}else if (day<=31) {
				System.out.println("Burcunuz Akrep");
			}else {
				System.out.println("Girdiğiniz Gün Verisi Geçersizdir!");
			}
			
		}else if (month.equals("kasım")) {
			
			if ((day>=1)&&(day<=21)) {
				System.out.println("Burcunuz Akrep");
			}else if (day<=30) {
				System.out.println("Burcunuz Yay");
			}else {
				System.out.println("Girdiğiniz Gün Verisi Geçersizdir!");
			}
			
		}else if (month.equals("aralık")) {
			
			if ((day>=1)&&(day<=22)) {
				System.out.println("Burcunuz Yay");
			}else if (day<=31) {
				System.out.println("Burcunuz Oğlak");
			}else {
				System.out.println("Girdiğiniz Gün Verisi Geçersizdir!");
			}
			
		}else {
			System.out.println("Lütfen Geçerli Bir Ay Giriniz!");
		}

	}

}
