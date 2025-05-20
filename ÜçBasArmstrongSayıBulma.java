public class ÜçBasArmstrongSayıBulma {

	public static void main(String[] args) {
		
		for(int i = 99 ; i<=999 ;i++){
		int digit = 0;
		int result = 0;
		int temp = i;
		
			while(temp !=0){
				digit = temp % 10;
				result += digit*digit*digit;
				temp /= 10;
			}
			
			if(result == i){
				System.out.println(i +" Sayısı bir armstrong sayıdır.");
			}
		}

	}

}
