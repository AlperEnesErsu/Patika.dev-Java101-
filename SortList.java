import java.util.Arrays;
import java.util.Scanner;


public class SortList {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dizi boyutu n : ");
		int n = scanner.nextInt();
		
		int[] list = new int[n];
		
		System.out.println("Dizinin elemanlarını giriniz : ");
		for(int i =0; i<list.length; i++) {
			System.out.print((i+1)+". Elemanı :");
			int num = scanner.nextInt();
			list[i] = num;
		}
		
		Arrays.sort(list);
		
		System.out.print("Sıralama : ");
        for (int num : list) {
            System.out.print(num + " ");
        }
	}

}
