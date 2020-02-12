package day01;

public class Test01 {
	//System.out.println("변수 1 : " + stringNumber1); //=> 실행문은 함수 안에다 작성하는게 원칙이다.
	public static void main(String[] args) {
		String stringNumber1 = "abcd"; // camel 표기법 //지역변수 <- 함수를 벗어나면 사용할 수 없음.
		
		String string_number2 = "efgh"; // snake 표기법
		
		System.out.println("변수 1 : " + stringNumber1);
		System.out.println("변수 2 : " + string_number2);
	}
}
//System.out.println("변수 1 : " + stringNumber1); // ==> 영역의 위치를 벗어나면 실행되지 않는다.
class Test01_01{
	public static void main(String[] args) {
		String stringNumber1 = "abcd"; // camel 표기법
		
		System.out.println("변수 1 : " + stringNumber1);
	}
}