package 제어문예제;

public class forEx01 {

	public static void main(String[] args) {
		int sum = 0;   //누적 변수는 초기값 0으로 하자!!
		 for(int i=1; i<=100; i++) {
			 sum = sum + i;
			     }
		 System.out.println("1부터 100까지의 합은 "+ sum + "입니다.");
		 // 1부터 100까지의 합은 5050입니다.
	}

}
