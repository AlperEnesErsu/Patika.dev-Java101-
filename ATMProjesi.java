import java.util.Scanner;

public class ATMProjesi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int right = 3;
		int balance = 1500;
		int select;
		int price;
		
		while (right > 0) {
			System.out.print("Kullanıcı Adınızı Giriniz : ");
			String userName = scanner.nextLine();

			System.out.print("Parolanızı Giriniz : ");
			String password = scanner.nextLine();

			if ((userName.equals("patika")) && (password.equals("dev123"))) {
				System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz.");
				do {
					System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
					System.out.println("1- Para Yatırma\n2- Para Çekme\n3- Bakiye Sorgula\n4- Çıkış Yap");
					select = scanner.nextInt();
					
					switch (select) {
					case 1:
						System.out.println("Yatırmak istediğiniz para miktarını giriniz : ");
						price = scanner.nextInt();
						balance += price;
						break;

					case 2:
						System.out.println("Çekmek istediğiniz para miktarını giriniz : ");
						price = scanner.nextInt();
						if (price>balance) {
							System.out.println("Bakiyeniz Yetersiz.");
						}else {
							balance -= price;
						}
						break;

					case 3:
						System.out.println("Bakiyeniz : " + balance);
						break;
						
					default:
						System.out.println("Lütfen Geçerli Bir Sayı Giriniz.");
					} 
					
				} while (select != 4);
				System.out.println("Tekrar görüşmek üzere!");
				break;
			} else {
				right--;
				System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
				if (right == 0) {
					System.out.println("Hesabınız Bloke Olmuştur Lütfen Banka İle İletişime Geçiniz.");
				} else {
					System.out.println("Kalan Hakkınız : " + right);
				}
			}
		}

	}

}
