import java.util.Scanner;

public class KullanıcıGirişi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String userNameExpected = "patika";
		String passwordExpected = "java123";

		System.out.print("Kullanıcı Adınızı Giriniz : ");
		String userName = scanner.nextLine();

		System.out.print("Şifrenizi Giriniz : ");
		String password = scanner.nextLine();

		if (userName.equals(userNameExpected) && password.equals(passwordExpected)) {
			System.out.println("Giriş Yaptınız.");
		} else {

			System.out.println("Şifreniz Yanlış, Şifrenizi Sıfırlamak isterseniz 1'e basın.");
			int choice = scanner.nextInt();
			scanner.nextLine();

			if (choice == 1) {

				System.out.print("Lütfen Yeni Şifreyi Giriniz : ");
				String newPassword = scanner.nextLine();

				if (newPassword.equals(passwordExpected)) {

					System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

				} else {
					password = newPassword;
					System.out.println("Şifre başarıyla oluşturuldu.");
				}
			} else {
				System.out.println("Tekrar denemek için sayfayı yenileyebilirsiniz.");
			}
		}
	}

}
