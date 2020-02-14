package day04;

import java.util.Scanner;

public class Ex01 {
	/*
	 	숙제 1]
	 		알파벳 문자 하나를 입력받아서
	 		소문자면 대문자로 대문자면 소문자로 변환해서 출력하세요.
	 		
	 		'a' - 'A' > 32
	 		
	 		b - 32 ==> 'B'
	 		
	 	숙제 2]
	 		정수 3개를 입력받아서
	 		세 수중 큰 숫자만 출력되게 하세요.
	 		
	 		이 두가지 모두 삼항연산자로 처리해보세요.
	 		
	 	숙제 3]
	 		평년과 윤년의 차이 1. 100으로 나누어지지 않고 4로 나누어지면 윤년

			2. 100으로 나누어지지만 400으로 나누어지지 않는 해는 평년

			3. 400으로 나누어 지는 해는 윤년

	 		 추가: 위의 3가지 조건을 모두 충족하지 않는 해는 평년
	 */
	public static void main(String[] args) {
		// 1. 입력받을 준비하고
		Scanner sc= new Scanner(System.in);
		// 2. 메세지 출력하고
		System.out.print("문자를 입력하세요! : ");
		// 3. 입력데이터 변수에 담고
		String str = sc.nextLine();
		// 4. 변수에 담긴 문자열에서  문자 추출하고
//		char ch = (str >= 'a') ? (char)(str - ('a' - 'A')) : (char)(str + ('a'-'A'));
		// 5. 변환해서 변수에 담고
	
		// 6. 출력해주고
	}
}
