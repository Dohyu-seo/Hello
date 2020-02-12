package day02;

public class Test04 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 5;
		int no3 = 3;
		double no4 = 3.; // ==> 3. == 3.0 과 같은 데이터
		System.out.println("no1 / no2 : " +(no1 / no2));
		System.out.println("no1 / no3 : " +(no1 / no3)); //출력 :3.333이 아니라 3 (int라서 정수 반환한 결과값)
		System.out.println("no1 % no3 : " +(no1 % no3)); //출력 : 1 = %는 나머지 값이 나오는 연산자.
		System.out.println("no1 / no4 : " +(no1 / no4)); //출력 : 정수와의 결과는 정수가, 정수+실수의 결과엔 실수가 나옵니다.
		System.out.println("no1 + no2 : " + no1 + no2); //출력 : 문자열 연산+숫자(문자화) + 숫자 = 105가 나온다. 문자10과 숫자5이다.
		//									10	+	5
		//					no1 + no2 : 105
	}
}
