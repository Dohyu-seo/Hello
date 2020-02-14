package day05;

/*
 	문제]
 		1. 알파벳 'O' 부터 순차적으로 문자를 5개를 만들어서 출력하세요. 
 */
public class Ex02 {
	public static void main(String[] args) {
		for(char i='O'; i < 'T'; i++) {
			System.out.println((char)i);
		}
	}
} 
/*
 	// 변수 선언하고 초기화하고
 	 char ch = 'O';
 	 //반복해서 출력하고
 	for(int i = 0; i < 5; i++){
 		Sytem.out.println((char)(ch+i));
 */

