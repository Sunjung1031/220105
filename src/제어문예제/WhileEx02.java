package 제어문예제;

public class WhileEx02 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

}
