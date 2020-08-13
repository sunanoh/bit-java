package javaEx.com.basic;

public class MethodEx {

	public static void main(String[] args) {
		
		//System.out.println(sum(1,4));
		//printMessage("안녕");
		//sum(10, 20, 30, 40, 50); // 인수들이 배열 형태로 변환되어 전달
		//System.out.println("가변인수 연습: "+ sum(10,20,30,40,50));
		printSum("가변인수 연습 : ", 10,20,30,40,50);
	}
	
	// 고정인수, 가변인수를 함께 사용 가능
	// 같이 사용할 경우, 순서가 중요함
	// 반드시 고정인수 -> 가변인수 순으로 사용해야 함
	private static void printSum(String message, double ...values) {
		                         //고정인수              //가변인수
		double total = sum(values);
		System.out.println(message + ":" + total);
	}
	
	
	// 가변인수
 	private static double sum(double ... values) {
		System.out.println("인수의 갯수: "+ values.length);
		double total = 0;
		for (double val: values) { // 향상된 for문
			total += val;
		}
		return total;
	}

	
	private static double sum(double a, double b) {
		return a + b; // 데이터는 double이어야 한다.
	}
	
	private static void printMessage(String message) {
		// 리턴할 데이터가 없으면 void
		System.out.println(message);
		
	}

}
