package day03;

public class Ex01 {
	// �غ��� 7�̰� ���̰� 6�� �ﰢ���� ������ ���ϼ���.
	// ��, ������ ������Ÿ���� float�� �����ϼ���.
	public static void main(String[] args) {
	 /*int ex011 = 7;
	 int ex012 = 6;
	 float ex013 = 0.5f;
	 
	 float ex014 = ex011 * ex012 * ex013;
	 
	 System.out.println("�غ��� " + ex011 +"�̰� ���̰� " + ex012 + "�� �ﰢ���� ������ " + ex014 + "�Դϴ�.");
	 */
		// ����� Ǯ��
		
		int width = 7;
		int height = 6;
		float area = width * height * 0.5f;
		// float area = width * height / 2.f;
		float area2 = width * height * (float)0.5;
		
		System.out.println("�غ��� " + width + "�̰� ���̰� "+height+"�� �ﰢ���� ���̴� " +area+"�Դϴ�.");
		System.out.println("�غ��� "+width+"�̰� ���̰� "+height+"�� �ﰢ���� ���̴� "+area2+"�Դϴ�.");
		
	}
}
