package day01;

public class Test01 {
	//System.out.println("���� 1 : " + stringNumber1); //=> ���๮�� �Լ� �ȿ��� �ۼ��ϴ°� ��Ģ�̴�.
	public static void main(String[] args) {
		String stringNumber1 = "abcd"; // camel ǥ��� //�������� <- �Լ��� ����� ����� �� ����.
		
		String string_number2 = "efgh"; // snake ǥ���
		
		System.out.println("���� 1 : " + stringNumber1);
		System.out.println("���� 2 : " + string_number2);
	}
}
//System.out.println("���� 1 : " + stringNumber1); // ==> ������ ��ġ�� ����� ������� �ʴ´�.
class Test01_01{
	public static void main(String[] args) {
		String stringNumber1 = "abcd"; // camel ǥ���
		
		System.out.println("���� 1 : " + stringNumber1);
	}
}