package day02;

public class Ex01 {
	public static void main(String[] args) {
		// 1. �غ��� 5�̰� ���̰� 3�� �ﰢ���� ���̸� ���ؼ� ����ϼ���.
		//		�ﰢ���� ���� ����
		//			���� = �غ� * ���� * 0.5
		// ���� ����� �ʱ�ȭ
		
			int width = 5;
			int height = 3;
			double soo = 0.5;
			
			double area1 = width * height * soo;
			
		System.out.println("1. �غ��� " + width +"�̰� ���̰� " + height + "�� ������� ������ " + area1 + " �Դϴ�.");
		// 2. ���ΰ� 5, ���ΰ� 7�� ������� ���̸� ���ؼ� ����ϼ���.
		//			���� = ���� *����
		// ��������� �ʱ�ȭ
		
			int garo = 5;
			int sero = 7;
			int area2 = garo * sero;
		System.out.println("2. ���ΰ� "+garo+"�̰� ���ΰ� " + sero +"�� �簢���� ���̴� " + area2 + " �Դϴ�.");
		// 3. �������� 2�� ���� �ѷ��� ���ؼ� ����ϼ���.
		//		�ѷ� = 2 * ������ *3.14
		// ���� ����� �ʱ�ȭ
			
		int red = 2;
		double pi = 3.14;
		double arround = 2 * red * pi;
		System.out.println("3. �������� " + red + "�� ���� �ѷ��� " + arround + " �Դϴ�.");
		// ���� ������ �����ʹ� ������ ����� ������ �����ؼ� ����ϼ���.
		
		int one1 = 5;
		int one2 = 3;
		double one3 = 0.5;
		int two1 = 5;
		int two2 = 7;
		int thr1 = 2;
		int thr2 = 2;
		double thr3 = 3.14;
		
		System.out.println(one1 * one2 * one3);
		System.out.println(two1 * two2);
		System.out.println(thr1 * thr2 * thr3);
	}
}
