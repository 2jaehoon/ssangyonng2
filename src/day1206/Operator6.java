package day1206;
/**
����(���� ������)
 ����� ? ��1 : ��2
*/


class Operator6 {
	public static void main(String[] args) {
		int i=-10;
		System.out.println(i+"��(��) " + (i > 0 ?"���":"����"));
		
		i=13;
		//i���� Ȧ������ ¦�������� ����ϴ� �ڵ� �ۼ�
		System.out.println(i%2!=0?"Ȧ��":"¦��");

		char c = 'C';//a
		//c������ �Ҵ�� ���� �빮���� ������ "�빮�� ���ĺ�" �׷��� ������ "�빮�ڰ� �ƴմϴ�."���
		System.out.println((c>='A'&&c<='Z')?"�빮�� ���ĺ�":"�빮�ڰ� �ƴմϴ�.");
		System.out.println((c>64&&c<91)?"�빮�� ���ĺ�":"�빮�ڰ� �ƴմϴ�.");
		i=50;
		//i�� 0~100 ���̸� ��ȿ������ �׷��� ������ ��ȿ������ ���
		System.out.println((i>=0&&c<=100)?"��ȿ����":"��ȿ����");
	
	

	
	}
}