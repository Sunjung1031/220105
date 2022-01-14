package 제어문예제;

/*
 *  1부터 100까지의 짝수의 합을 구하는 프로그램 작성
 */
public class forEx03 {
	public static void main(String[] args) {
		int sum = 0; 
		for(int i=1; i<=100; i++) {
			if(i%2 == 1) {     // i가 i를2로 나눴을 때 나머지가 0이면,
				sum = sum + i; // sum에 sum+i를 더한다.
			}
          } 
		System.out.println("1부터 100까지의 짝수의 합은" + sum + "입니다.");
		}
	
}


//순서도 -> sum=0  내일은 fow while정도