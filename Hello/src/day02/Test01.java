package day02;

public class Test01 {
	public static void main(String[] args) { //main함수를 작성해야함. 매게변수의 이름은 다르게 써도 상관없습니다. args<<  예: a로 변경해도 상관없습니다.
		String msg = "오늘은 "; //" :문자열  표현, ' : 문자를 표현.
		String month = "2월 "; // String : 문자열 타입에 클래스를 만들어주는 함수. -month : 변수.
		String day = "11일 ";
		String str = "입니다.";
		System.out.print("결과 : " + msg + month + day + str); // 1번 print : 문장을 찍어줌, 줄바꿈하지 않음.
		System.out.print("결과 : " + msg + month + day + str); // 2번
		System.out.println(); //println : 문장을 찍어준 뒤 줄바꿈을 함.
		System.out.println("결과 : " + msg + month + day + str); // 3번
		System.out.println("결과 : " + msg + month + day + str);	// 4번
		
		//변수 변경하기 : 변수는 데이터를 먼저 만든다음에 변경할 수 있는 수.
		msg = "내일은 ";
		day = "12일 ";
		
		System.out.println(); //println : 문장을 찍어준 뒤 줄바꿈을 함.
		System.out.println("결과 : " + msg + month + day + str); // 3번
		System.out.println("결과 : " + msg + month + day + str);	// 4번
	}
}
