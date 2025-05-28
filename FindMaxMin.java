import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Integer closeMin = null;
        Integer closeMax = null;
        
        System.out.print("Girilen Sayı : ");
        int number = scanner.nextInt();
        
        for (int i : list) {
            if (i < number) {
                if (closeMin == null || i > closeMin) {
                    closeMin = i;
                }
            } else if (i > number) {
                if (closeMax == null || i < closeMax) {
                    closeMax = i;
                }
            }
        }

        if (closeMin != null)
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + closeMin);
        else
            System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");

        if (closeMax != null)
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + closeMax);
        else
            System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
    }
}
