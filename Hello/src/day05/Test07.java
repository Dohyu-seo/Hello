package day05;

/*
 	�迭
 		: ���� Ÿ���� �����͸� ������ ���ÿ� �����ϵ��� �س��� Ÿ��.
 		
 		����]
 			������Ÿ��[] �����̸� = new ������Ÿ��[������ ����]; // new�� �Ǿ� Heap�� ���� ������ ������ Ÿ���̴�.
 			
 		������ ������ ���]
 			�����̸�[index]; //index : ��ġ��
 */
public class Test07 {
	public static void main(String[] args) { //���ڿ��� �� �迭.
		// 1 ~ 5���� ���ڸ� �迭�� ��Ƽ� ����ϼ���.
		int[] num = new int[5]; //int Ÿ���� ������ �� ���� ���� �� �� �ִ� �迭�� ������� ��.
		for(int i = 0; i < 5; i++) {
			num[i] = i + 1;
		}
		
		for(int i = 0; i < num.length ; i++) {
			System.out.println(num[i]);
		}
	}
}
