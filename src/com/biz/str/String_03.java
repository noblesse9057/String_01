package com.biz.str;

public class String_03 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		int intNationlen= strNation.length();
		
		// ���ڿ��� 1���ھ� �и��ؼ� ���ڷ� �ٲٴ� �ڵ�
		// �ٲ۹��ڸ� �ֿܼ� ǥ��
		
		// 1���ڵ�
		for(int i=0; i < intNationlen; i++) {
			char c = strNation.charAt(i);
			System.out.print(c+"\t");
		}
		// 2���ڵ�
		for(int i=0; i < strNation.length(); i++) {
			char c = strNation.charAt(i);
			System.out.print(c+"\t");
		}
		/*
		 * 1���ڵ�� ���ڿ��� ���̸� ����Ͽ� ������ ��Ƶΰ�
		 *  �������� �о� for�ݸ��� ��ȸ�Ѵ�.
		 * 
		 * 2���ڵ�� ���ڿ��� ���̸� ����ϱ����Ͽ�
		 *  ���ڿ��� ����(����)��ŭ ����ؼ� length() �޼��带 ȣ���Ѵ�.
		 * 
		 * ���� 1���ڵ�� ������ �����ؾ��ϴ� ���ŷο��� ������ 
		 * 2���� ���ϸ� ����ӵ��� �� ������.
		 */
	}

}
