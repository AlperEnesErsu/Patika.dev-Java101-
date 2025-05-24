import java.util.Scanner;

public class DeseneGöreMetotOluşturma {

    static void desen(int n) {
        System.out.print(n + " "); // İleri giderken bastığımız değer

        if (n > 0) {
            desen(n - 5);
            System.out.print(n + " "); // Geri dönerken bastığımız değer
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int n = scanner.nextInt();
        desen(n);
    }
}