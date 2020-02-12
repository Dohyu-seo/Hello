package day02;

public class Test03 {

		public static void main(String[] args) {
			/*
			 	main 함수의 매개변수
			 		String[] args
			 	는 데이터 타입이 String[] 이고
			 	변수 이름이 args 이다.
			 	여기서 []는 배열을 나타낼 때 사용하는 기호이다.
			 	
			 	
			 */
			
		 String[] arr = {"abcd", "efgh", "ijkl"}; // 같은 타입의 문자열을 하나의 타입으로 관리할 때 쓰는게 배열
		 
		 /*
		  		상수
		  			final 데이터타입 변수이름 = 데이터 ; 
		  */
		 
		 final double PI; // 변수 선언 / 스택 : 변수이름, 타입, 주소기억 = 선언하게 되면 데이터 참조 전 까지만 됨. 데이터를 정해줄 수 있음. 
		 PI = 3.14;
		 System.out.println(PI);
		}
		
		final double PI = 3.14; //타입은 사이즈를 결정해야합니다. 타입을 결정해주세요.
		
		
		public void setPi() {
			System.out.println(PI);
		}
}
