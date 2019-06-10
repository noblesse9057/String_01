package com.biz.str;

public class String_11 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
		String s1 = "";
		String s2 = "";
		// strNation에 담긴 문자열의 12번째(0부터) 위치부터 잘라서 s1에 담아라
		s1 = strNation.substring(12);
		System.out.println(s1);
		
		// 0번째부터  12번째 앞까지 잘라서 s2에 담아라
		s2 = strNation.substring(0,12);
		System.out.println(s2);
		
		System.out.println(s2 + s1);
		
		// 12번째 문자열을 추출하여 문자로 변화시켜라
		char c = strNation.charAt(12);
		
	}
}
