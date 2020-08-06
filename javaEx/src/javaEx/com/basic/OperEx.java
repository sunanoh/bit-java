package javaEx.com.basic;

public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arithOper();
		// incDecOper();
		logicalOper();
	}

	// 비교, 논리연산
	public static void logicalOper() {
		// 비교 연산자 : >, >=, <, <=, == (같다), != (같지않다)
		// 논리 연산자 : &&(논리곱 AND), ||(논리합 OR), !(논리부정 NOT)
		
		int n = 5;
		
		// n은 0 초과, 10 미만인가?
		// 조건 1: n > 0 이고,
		// 조건 2: n < 10 이다	
		boolean b1 = n > 0;
		boolean b2 = n < 10;
		boolean r = b1 && b2;
		System.out.println("a > 0 and a < 10 ? " + r);
		
		// n은 0이하 이거나, 10 이상인가?
		// 조건 1: n <= 0 이거나,
		// ㅈ건 2: n >= 10		
		b1 = n <= 0;
		b2 = n >= 10;
		r = b1 || b2;
		System.out.println("a <= 0 or a >= 10 ? " + r);
		
		boolean notR = !r;
		System.out.println("논리부정 : " + notR);
	}
	
	// 증가, 감소 연산자
 	public static void incDecOper() {
		
		// 순서가 중요
		int a = 5; // a++
		int b = 5; // ++a
		
		// 후위연산자
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		// 전위연산자
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);
	}
	
	
	// 산술연산자
	public static void arithOper() {
		// 사칙연산 : +, -, , /
		int a = 7;
		int b = 3;
		
		System.out.println("7 / 3 = " + (7/3));
		// int / int -> int(몫)
		System.out.println("7 / 3의 몫 = " + (7%3));
		// 나머지연산자 : %
		
		// 정확한 실수값을 얻으려면 int -> float 변환
		
		System.out.println("7 / 3 실수 => " + (float)a/(float)b);
		
		
		// 만약, 정수를 0으로 나누면
		// ArithmeticException
		//System.out.println("정수 나누기 0 " + (a/0));
		
		// 실수를 0으로 나눈다
		// "실수 / 0 => Infinity" 무한대가 나옴
		System.out.println("실수 / 0 => " +(4.0/0));
		// 무한대에 산술연산 -> 무한대
		System.out.println("무한대의 산술 => " + (4.0/0 + 10));
		// 연산 -> 계산할 수 없는 값(NaN -> Not a Number)
		System.out.println("0.0/0.0 => "+ (0.0/0.0));
		// NaN 포함된 산술 연산 -> NaN (계산불가)
		System.out.println("NaN 산술 => " + (0.0/0.0 + 20));
		// 유한수인지 확인
		System.out.println("유한수의 확인: " + Double.isFinite(4.0/0));
		// NaN인지 확인
		System.out.println("NaN 확인 => " + Double.isNaN(0.0/0.0));
		
		
		
		
		
		
	}
}
