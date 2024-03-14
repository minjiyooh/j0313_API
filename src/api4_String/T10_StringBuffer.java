package api4_String;

/*
  =>mutable (가변적) / immutable (불가변)
 	String 객체 : immutable 객체로서 class 로서 한번 크기가 생성된 값을 그 값을 유지하게 된다. 짧은 문자열 처리
 	StringBuffer 객체 : mutable 객체로서 크기를 변경할 수 있다. 동기화를 제공, 멀티스레드 제공 및 사용하기 적절하다. 가변길이 문자열에 적당
 	StringBuilder 객체 : mutable 객체로서 크기를 변경할 수 있다. 동기화 여부가 불분명, 가변길이 문자열 적당 
 	성능 : StringBuilder < StringBuffer <<< 
 */
public class T10_StringBuffer {
	public static void main(String[] args) {
		String str = new String("홍길동");
		System.out.println("1.str : " + str);

		str += "/홍길동2";
		System.out.println("2.str : " + str);

		// capacity() : 현재 버퍼의 크기를 알아낸다.
		// str.capacity();
		
		//StringBuffer()객체:가변길이 클래스로서 기본크기는 16, 자료가 넘치면 상황에 따라서 크기를 변경처리한다.
		//append : 값을 추가 , insert : 값을 특정위치에 삽입 ,delete: 특정위치의 값을 지정한 개수만큼 삭제처리
		StringBuffer str2= new StringBuffer();
		System.out.println("3. str2 버퍼크기 : " + str2.capacity());
		str2.append("atom");
		System.out.println("4. str2  : " + str2);
		System.out.println("5. str2 버퍼크기 : " + str2.capacity());
	
		str2.append("0123456789012345");
		System.out.println("6. str2  : " + str2);
		System.out.println("7. str2 버퍼크기 : " + str2.capacity());
		
		str2.insert(2, "abcdefg");
		System.out.println("8. str2  : " + str2);
		System.out.println("9. str2 버퍼크기 : " + str2.capacity());
		
		str2.replace(2,5, "!!!!!!!!!!!!");
		System.out.println("10. str2  : " + str2);
		System.out.println("11. str2 버퍼크기 : " + str2.capacity());
		
		str2.delete(5, 20);
		System.out.println("12. str2  : " + str2);
		System.out.println("13. str2 버퍼크기 : " + str2.capacity());
		
	}

}
