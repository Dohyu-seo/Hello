package day05;

import java.util.*;
public class Test02 {

	// ���ڸ� ������ �Է¹޾Ƽ� �� ���ڰ� 10�� �ڸ����� 20�� �ڸ����� �Ǻ��� �ִ� ���α׷�
	// �Է��Ͻ� ���ڿ��� n0�ڸ��� �����Դϴ�

	public static void main(String[] args) {
		// �� �ڸ� ����(10~59)�� �Է¹޾Ƽ� �� ���� ���� ������ �� ���� ū������ �˾Ƴ�����
		// ����
		// 1. �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// 2. �޼��� ����ϰ�
		System.out.print("10 ~ 59 �� ���ڸ� �Է��ϼ���! : ");
		// 3. �Է¹޾Ƽ� ������ ���
		int no = sc.nextInt();
		// 4. �����ڸ� ����ϰ�
		//		���ǿ� ���� ���� ������ ���� �����

		int num = 0;
		// 5. ����ó���ϰ�
		if (no >= 10 && no < 60) { //���� 
			if( no >= 50) { // && no <60 ���� ���������ڸ� �־ 59 ���� ���� ó�� ���ϵ��� ��.
				num =50;
			}else if (no >= 40) {
				num = 40;
			}else if (no >= 30) {
				num = 30;
			}else if (no >= 20) {
				num = 20;
			}else if (no >= 10) {
				num = 10;
			}
		}else {
				num = 0;
			}
		// 6. ����ϰ�
		System.out.println("�Է��� ���� [" + no +"] �� ���� �ڸ��� " + num + "�Դϴ�.");
		
	}
}