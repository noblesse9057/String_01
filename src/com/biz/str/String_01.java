package com.biz.str;

public class String_01 {

	public static void main(String[] args) {

		
		// �Ϲ����� ������ ����� ������� ���ڿ� ������ �����Ѵ�.
		// ���ڿ� ���� => ���ڿ� ��ü ��� �Ѵ�.
		String strNation = "Republic of Korea";
		
		// new Ű���带 ����ؼ� ���ڿ� ����(��ü)�� ����
		// ����ִ�(blank) ����(��ü)�� �����Ѵ�.
		String strName = new String();
		
		// String strHong = "ȫ�浿";
		String strHong = new String("ȫ�浿");
		
		// ���ڿ��� + ������ ���ؼ� ���ڿ��� �����Ҽ� �ִ�.
		System.out.println("Nation :" + strNation);
		
		
	}

}
