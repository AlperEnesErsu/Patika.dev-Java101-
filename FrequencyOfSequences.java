public class FrequencyOfSequences {

	public static void main(String[] args) {
		
		int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
		
		System.out.print("Dizi : ");
		for (int k = 0; k < list.length; k++) {
			System.out.print(list[k] + " ");
		}
		
		System.out.println("\nTekrar Sayıları");
		
		for (int i = 0; i < list.length; i++) {
			boolean alreadyCounted = false;

			
			for (int k = 0; k < i; k++) {
				if (list[i] == list[k]) {
					alreadyCounted = true;
					break;
				}
			}

			if (alreadyCounted)
				continue;

			int count = 0;
			for (int j = 0; j < list.length; j++) {
				if (list[i] == list[j]) {
					count++;
				}
			}

			System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
		}
	}
}
