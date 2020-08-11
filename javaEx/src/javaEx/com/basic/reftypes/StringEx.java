package javaEx.com.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
		//stringBasic();
		//stringFormat();
	}
	
	public static void stringFormat() {
		// 포맷 문자
		// %d(10진), %s(문자열), %f(실수)
		// %n(개행), %%(%)
		// 0개의 0중에서 0개를 먹었다.
		
		// 같은 포맷으로 계속 만들어야할 경우!
		
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		
		String fmt = "%d개의 %s중 에서 %d개를 먹었다.";
		System.out.printf(fmt, total, fruit, eat);
		System.out.println("");
		// 포맷 문자 지정에 유의
		
		// printf에서만 사용하는 것이 아니고
		// 새로운 문자열을 생성할 때 사용한다
		
		String res = String.format("파이상수는 %f입니다.", Math.PI);
		System.out.println(res);
		// %f의 경우 --> 소수점 자리를 제한할 수 있다.
		
		res = String.format("파이상수는 %.2f입니다.", Math.PI);
		System.out.println(res);
	}
	
	public static void stringBasic() {
		// 가장 기본적인 참조자료형을 이해
		String str; // 선언
		str = "Java";
		String str2 = "Java"; // 선언 + 할당
		String str3 = new String("Java"); 
		
		// 참조타입의 경우, 
		// ==, != 은 주소의 비교(hashCode 비교)
		System.out.println(str==str2);
		System.out.println(str2==str3);
		
		//값의 비교
		//객체 내부에 equals라고 하는 메서드를 이용
		System.out.println(str.equals(str2));
		System.out.println(str2.equals(str3));
		
	}

}
