package �������;

/*
 *  1���� 100������ ¦���� ���� ���ϴ� ���α׷� �ۼ�
 */
public class forEx03 {
	public static void main(String[] args) {
		int sum = 0; 
		for(int i=1; i<=100; i++) {
			if(i%2 == 1) {     // i�� i��2�� ������ �� �������� 0�̸�,
				sum = sum + i; // sum�� sum+i�� ���Ѵ�.
			}
          } 
		System.out.println("1���� 100������ ¦���� ����" + sum + "�Դϴ�.");
		}
	
}


//������ -> sum=0  ������ fow while����