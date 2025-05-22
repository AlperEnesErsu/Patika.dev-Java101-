import java.util.Scanner;

public class FibonacciSerisi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç elemanlı Fibonacci serisi oluşturmak istiyorsunuz? ");
        int n = scanner.nextInt();

        int ilk = 0, ikinci = 1;

        System.out.println(n + " elemanlı Fibonacci serisi:");

        for (int i = 1; i <= n; i++) {

            int sonraki = ilk + ikinci;
            
            System.out.print(ilk + " + " + ikinci + " ="+ sonraki + "\n");
            
            ilk = ikinci;
            ikinci = sonraki;
        }
    }
}