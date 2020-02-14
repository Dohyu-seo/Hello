package day05;

/*
 	배열
 		: 같은 타입의 데이터를 여러개 동시에 관리하도록 해놓은 타입.
 		
 		형식]
 			데이터타입[] 변수이름 = new 데이터타입[관리할 갯수]; // new가 되어 Heap에 들어가기 때문에 참조형 타입이다.
 			
 		데이터 꺼내는 방법]
 			변수이름[index]; //index : 위치값
 */
public class Test07 {
	public static void main(String[] args) { //문자열로 된 배열.
		// 1 ~ 5까지 숫자를 배열에 담아서 출력하세요.
		int[] num = new int[5]; //int 타입의 정수를 한 번에 관리 할 수 있는 배열이 만들어진 것.
		for(int i = 0; i < 5; i++) {
			num[i] = i + 1;
		}
		
		for(int i = 0; i < num.length ; i++) {
			System.out.println(num[i]);
		}
	}
}
