package day05;

/*
 	break	 : ���� ����ǰ��ִ� �ݺ����̳� switch ���� ��� �����ϼ���. ��� �ǹ��� ���ɾ�
 	continue : ���� ����Ǵ� �ݺ����� ���� ȸ���� ��� �����ϼ���. ��� ����
 */
public class Test08 {
	// 1���� 5���� ����ϴµ� 3�� �����ϼ���.
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			if(i == 3) {
				
				continue;
			}
			System.out.println(i);
			
	}
	}
}