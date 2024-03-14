package api10_Pattern;

import java.util.regex.Pattern;

//문자열 정규식
//a또는 b또는 C문자가 포함? ^[abc]*$, ^[a|b|c]*$
public class Test4 {
	public static void main(String[] args) {
		String regEx1 = "^[abc]*$"; 
		
		String str1 = "1234";
		String str2 = "1234ghjk";
		String str3 = "a";
		String str4 = "bc";
		String str5 = "asdf";
		String str6 = " ";
		String str7 = "asDf";
		String str8 = "abcsDf";
		
		System.out.println("1 : " + Pattern.matches(regEx1, str1));
		System.out.println("2 : " + Pattern.matches(regEx1, str2));
		System.out.println("3 : " + Pattern.matches(regEx1, str3));
		System.out.println("4 : " + Pattern.matches(regEx1, str4));
		System.out.println("5 : " + Pattern.matches(regEx1, str5));
		System.out.println("6 : " + Pattern.matches(regEx1, str6));
		System.out.println("7 : " + Pattern.matches(regEx1, str7));
		System.out.println("8 : " + Pattern.matches(regEx1, str8));
	
		System.out.println();
		System.out.println();
		String regEx2 = "^[a|b|c]*$"; 
		
		
		String str11 = "1234";
		String str12 = "1234ghjk";
		String str13 = "a";
		String str14 = "bc";
		String str15 = "asdf";
		String str16 = " ";
		String str17 = "asDf";
		String str18 = "abcsDf";
		
		
		System.out.println("11 : " + Pattern.matches(regEx1, str11));
		System.out.println("12 : " + Pattern.matches(regEx1, str12));
		System.out.println("13 : " + Pattern.matches(regEx1, str13));
		System.out.println("14 : " + Pattern.matches(regEx1, str14));
		System.out.println("15 : " + Pattern.matches(regEx1, str15));
		System.out.println("16 : " + Pattern.matches(regEx1, str16));
		System.out.println("17 : " + Pattern.matches(regEx1, str17));
		System.out.println("18 : " + Pattern.matches(regEx1, str18));
		
		
		
		
		
		
		
	}
	
	
}
