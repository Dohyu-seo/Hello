package day05;

/*
 	�ݺ��� - while ����
 		����]
 		
 			while(���ǽ�){
 				���๮
 			}
 */
public class Test04 {
	/*
 	����] while �������� ó���ϼ���.
 		1. ���ĺ� 'O' ���� ���������� ���ڸ� 5���� ���� ����ϼ���. 
 */
	public static void main(String[] args) {
		
		// while �ݺ����� ���ɹ� ���ο� ī���� ������ ���� ������ ������ ������ ������ְ�
		// �����ĵ� ������ ó���ؾ� �Ѵ�.
		int i = 0; // ī���� ����.
		char ch = 'O'; //���ں���
		while(i < 5) {
			System.out.println((char)(ch+i));
			i++;
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
}