package 제어문예제;

/*
 *  자바 6버전 까지는 switch문의 괄호 안에는 정수 타입의 변수나 문자 타입만 올 수 있었다.
 *  자바 7버전 부터는 String 타입도 올 수 있다.
 */
public class SwitchEx02 {

	public static void main(String[] args) {
		String position = "선정";
		
		switch(position) {
		case "부장":
			System.out.println("급여가 700만원");
			break;
		case "과장":
			System.out.println("급여가 500만원");
			break;
		case "선정":
			System.out.println("급여가 없습니다.");
			break;
		default:
			System.out.println("급여가 300만원");
		}

	}

}
