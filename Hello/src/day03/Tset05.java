package day03;

public class Tset05 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 11;
		/*
	 	��������
	 		&	(and)
					��		����
			��		��		����
			����		����		����
			
			|	( or )
					��		����
			��		��		��
			����		��		����
	 */
		System.out.println((no1 > no2) && (no1++ < no2)); // && : ���� ������. ������ false�̸� �ڿ��ִ� ������ ����� �ʿ䰡 ���ٰ� �����.
		// no1 > no2 �� �����̰� �� ��ü ����� �ڸ� �������� �ʾƵ� �����̴� �޺κ� ������ �������� �ʴ´�.
		System.out.println("no1 : " + no1);
		System.out.println((no1 < no2) || (no1++ > no2)); // || : ���� ������. ������ true�̸� �ڿ��ִ� ������ ����� �ʿ䰡 ���ٰ� �����. 
		System.out.println("no1 : " + no1);
	}
}
