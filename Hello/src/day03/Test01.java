package day03;

public class Test01 {
	public static void main(String[] args) {
		int no = 10; // = : ���� ������, ���� ������ �����ʿ��� ���ʼ����� ���.
		System.out.println("1. no : " + no);
		no = no + 1;
		System.out.println("2. no : " + no);
		no += 1; // ==> no = no + 1;
		System.out.println("3. no : " + no);
		
		/*	��� �����ڴ� ��� ���� �����ڿ� ��밡��.
		 	-= : 
		 	*= : 
		 	/= : 
		 	%= :
		 */
		int num = 3;
		num *= 2; // ==> num = num * 2;
		num *= 2;
		System.out.println("num : " + num);
	}
}