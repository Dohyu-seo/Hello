package day02;

public class Test03 {

		public static void main(String[] args) {
			/*
			 	main �Լ��� �Ű�����
			 		String[] args
			 	�� ������ Ÿ���� String[] �̰�
			 	���� �̸��� args �̴�.
			 	���⼭ []�� �迭�� ��Ÿ�� �� ����ϴ� ��ȣ�̴�.
			 	
			 	
			 */
			
		 String[] arr = {"abcd", "efgh", "ijkl"}; // ���� Ÿ���� ���ڿ��� �ϳ��� Ÿ������ ������ �� ���°� �迭
		 
		 /*
		  		���
		  			final ������Ÿ�� �����̸� = ������ ; 
		  */
		 
		 final double PI; // ���� ���� / ���� : �����̸�, Ÿ��, �ּұ�� = �����ϰ� �Ǹ� ������ ���� �� ������ ��. �����͸� ������ �� ����. 
		 PI = 3.14;
		 System.out.println(PI);
		}
		
		final double PI = 3.14; //Ÿ���� ����� �����ؾ��մϴ�. Ÿ���� �������ּ���.
		
		
		public void setPi() {
			System.out.println(PI);
		}
}
