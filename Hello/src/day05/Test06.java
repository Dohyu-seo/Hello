package day05;

/*
 	랜덤한 숫자를 발생시키는 함수
 		Math.random() ==> double 타입의 데이터를 0 ~ 0.9999999... 까지 반환해주는 함수.
 */
public class Test06 {
	// 0 ~ 10까지의 숫자를 랜덤하게 발생하세요.
	public static void main(String[] args) {
		int no = (int)(Math.random() * (10 + 1));
		// (int)(Math.random() * ((최대숫자 - 최소숫자) + 1)) + 최소숫자; - 0부터 원하는 숫자를 랜덤하게 발생시켜줌.
		
		System.out.println("no : " +no);
		
		// 1~10까지 숫자를 랜덤하게 발생하세요.
		int num = (int)(Math.random() * 10) + 1;
		System.out.println("num : "+ num);
	
	}
}
