package com.biz.str;

public class String_09 {

	public static void main(String[] args) {

		String strKorea = "Korea";
		
		boolean bYes = true;
		
		bYes = strKorea.equals("KOREA");
		System.out.println(strKorea + "eq KOREA : " +bYes);
		
		bYes = strKorea.equalsIgnoreCase("KOREA");
		System.out.println(strKorea + "eqIg KOREA : " +bYes);
		
		bYes = strKorea.matches("Korea");
		System.out.println(strKorea + "ma KOREA : " +bYes);
		
		// strKorea ���ڿ����� Ko��� ���ڿ��� ���ԵǾ� �ִ���?
		bYes = strKorea.contains("Ko");
		System.out.println(strKorea + "contains KOREA : " +bYes);
		
		
		
	}

}
