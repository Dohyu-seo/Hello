package day05;

import java.util.*;

public class Ex01 {
	/*
	 	������ �Է¹޾Ƽ� ������ ������ִ� ���α׷��� �ۼ��ϼ���.
	 	������
	 		A : 90 ~ 100  
	 		B : 80 ~ 89
	 		C : 70 ~ 79
	 		D : 60 ~ 69
	 		F : 0 ~ 59
	 */
	/**public static void main(String[] args) {
			// 1. �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
			// 2. �޼��� ����ϰ�
		System.out.print("������ �Է��ϼ��� ! : ");
		 	// 3. �Է� �޾Ƽ� ������ ���.
		int no = sc.nextInt();
		 	// 4. ���� �����
		String str = "";
		 	// 5. ����ó���ϰ�
		if (no > -1 && no <= 100) {
			if (no >= 90){
				str = "A";
			}else if (no >= 80) {
				str = "B";
			}else if (no >= 70) {
				str = "C";
			}else if (no >= 60) {
				str = "D";
			}else{
				str = "F";
			}
		}
			// 6. ����ϰ�.
		System.out.println("�Է��� ���� ["+no+"]�� ["+str+"] �Դϴ�.");
	}
}
**/
	// ����� Ǯ��
	public static void main(String[] args) {
		// �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// �޼��� ����ϰ�
		System.out.print("������ �Է��ϼ���! : ");
		// �Է¹޾Ƽ� ������ ���
		int score = sc.nextInt();
		// ����� ���� �����
		String grade = "";
		// ����ó���ϰ�
		if (score >= 90 || score == 100) {
			grade = "A";
		}else if(score >=80) {
			grade = "B";
		}else if(score >=70) {
			grade = "C";
		}else if(score >=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		// ����ϰ�
		System.out.println("�Է��� ����[ "+score+" ] �� ������ [ "+grade+" ] �Դϴ�.");
	}
}
	