package api4_String;

import java.io.UnsupportedEncodingException;

public class practice {
	public static void main(String[] args) {
		String str1 = "안녕하세요";
		byte[]b1 = str1.getBytes();
		System.out.println("str1 : " + str1.length());
		
try {
	byte[]b2 = str1.getBytes("EUC-KR");
	System.out.println("b2 : " + b2.toString());
} catch (UnsupportedEncodingException e) {
	
	e.printStackTrace();
}

	}
	
	}

