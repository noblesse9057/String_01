package com.biz.str;

public class String_11 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
		String s1 = "";
		String s2 = "";
		// strNation�� ��� ���ڿ��� 12��°(0����) ��ġ���� �߶� s1�� ��ƶ�
		s1 = strNation.substring(12);
		System.out.println(s1);
		
		// 0��°����  12��° �ձ��� �߶� s2�� ��ƶ�
		s2 = strNation.substring(0,12);
		System.out.println(s2);
		
		System.out.println(s2 + s1);
		
		// 12��° ���ڿ��� �����Ͽ� ���ڷ� ��ȭ���Ѷ�
		char c = strNation.charAt(12);
		
	}
}
