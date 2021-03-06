package day05;

/*
 	반복문 - do ~ while 반복문
 	 	어떤 경우라도 적어도 한 번은 실행시키는 반복문. 
 	 	
 	 	형식 ]
 	 		do {
 	 			실행문
 	 		} while(조건식);
 */
public class Test05 {
	public static void main(String[] args) {
		boolean bool = false;
		do {
			System.out.println("한 번은 실행합니다.");
		} while(bool);
		 
		int i = 0;
		do {
			System.out.println(++i);
			/*
			 		i		++i
			 		0		1
			 		1		2
			 		2		3
			 		3		4
			 		4		5
			 */
		}while(i < 5);
	}
}
