package day02;

public class Test01 {
	public static void main(String[] args) { //main�Լ��� �ۼ��ؾ���. �ŰԺ����� �̸��� �ٸ��� �ᵵ ��������ϴ�. args<<  ��: a�� �����ص� ��������ϴ�.
		String msg = "������ "; //" :���ڿ�  ǥ��, ' : ���ڸ� ǥ��.
		String month = "2�� "; // String : ���ڿ� Ÿ�Կ� Ŭ������ ������ִ� �Լ�. -month : ����.
		String day = "11�� ";
		String str = "�Դϴ�.";
		System.out.print("��� : " + msg + month + day + str); // 1�� print : ������ �����, �ٹٲ����� ����.
		System.out.print("��� : " + msg + month + day + str); // 2��
		System.out.println(); //println : ������ ����� �� �ٹٲ��� ��.
		System.out.println("��� : " + msg + month + day + str); // 3��
		System.out.println("��� : " + msg + month + day + str);	// 4��
		
		//���� �����ϱ� : ������ �����͸� ���� ��������� ������ �� �ִ� ��.
		msg = "������ ";
		day = "12�� ";
		
		System.out.println(); //println : ������ ����� �� �ٹٲ��� ��.
		System.out.println("��� : " + msg + month + day + str); // 3��
		System.out.println("��� : " + msg + month + day + str);	// 4��
	}
}
