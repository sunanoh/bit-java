package com.javax.api.arrays;
import java.util.Arrays;
import java.util.Collections;

// Arrays 유틸리티 클래스
// 배열의 복제
// 배열의 정렬(sort)
// 배열의 검색

public class ArraysEx {

	public static void main(String[] args) {
		//arrayCopyEx();
		//basicSortTest();
		//basicSortDescendingTest();
		//customSortEx();
		//basicSearc();
		customSearch();
	}
	// 사용자 정의 자료형의 검색
	private static void customSearch() {
		Member[] mem = {new Member("홍길동"), new Member("고길동"), new Member("임꺽정"), new Member("장길산")};
		
		System.out.println("원본 배열 : "+ Arrays.toString(mem));
		Arrays.sort(mem);
		System.out.println("정렬된 배열 : "+ Arrays.toString(mem));
		int index = Arrays.binarySearch(mem, new Member("장길산")); 
		// 사용자 정의 객체의 검색시에는 객체를 넘겨주어 해당 객체와 같은지 비교해줘야 한다. 
		System.out.println("검색된 인덱스: "+index);
	}
	
	// 검색 테스트
	private static void basicSearc() {
		// java는 기본적으로 binary search 방식을 채택함 
		// binary search : 정렬된 배열을 반으로 쪼갠 후, 중간값에서 부터 왼/오른쪽 값을 비교해가며 대상 값 찾음
		// 미리 데이터가 정렬 되어 있어야 한다
		
		// 기본 자료형 검색
		int num[] = {5, 6, 2, 1, 3, 7, 9, 8, 4};
		System.out.println("원본 배열: "+ Arrays.toString(num));
		Arrays.sort(num); // 바이너리 검색 이전에 정렬이 되어 있어야 한다.
		int index = Arrays.binarySearch(num, 3);
		System.out.println("3의 인덱스 : "+index);
		
		// 참조 타입의 검색
		String[] items = {"Java", "C", "C++", "Python", "Linux"};
		System.out.println("원본 배열: "+ Arrays.toString(items));
		// 미리 데이터가 정렬되어 있어야 한다.
		Arrays.sort(items);
		System.out.println("정렬된 배열 : "+ Arrays.toString(items));
		int index2 = Arrays.binarySearch(items, "Linux");
		System.out.println("Linux의 인덱스 : "+ index2);
		
		
	}
	
	// 사용자 정의 정렬
	private static void customSortEx() {
		// Member 객체의 배열 생성
		Member[] mem = {new Member("홍길동"), new Member("고길동"), new Member("임꺽정"), new Member("장길산")};
		
		System.out.println("원본 배열: "+ Arrays.toString(mem));
		Arrays.sort(mem);
		System.out.println("정렬된 배열: "+ Arrays.toString(mem));  // -> 비교할 대상이 없어서 오류가 뜸 (Member cannot be cast to java.lang.Comparable)
		                                                        //  -> member객체에서 comparable 인터페이스를 구현해주면 실행됨
	}
	
	// 역순정렬, 내림차순(Descending :큰 값 -> 작은 값 순)
	private static void basicSortDescendingTest() {
		Integer[] scores = { 80, 50, 75, 90, 70, 88, 76}; // 기본타입 int를 받아들이지 못해서 integer로 변경함... 나중에 다시!
		System.out.println("원본 배열 : " + Arrays.toString(scores));
		
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("역순정렬 : " + Arrays.toString(scores));
	}
	
	// 기본정렬, 오름차순(Ascending : 작은 값 -> 큰 값 순)
	private static void basicSortTest() {
		int[] scores = { 80, 50, 75, 90, 70, 88, 76};
		System.out.println("원본 배열 : " + Arrays.toString(scores));
		
		// 정렬
		Arrays.sort(scores);
		System.out.println("기본정렬 : " + Arrays.toString(scores));

	}
	
	
	private static void arrayCopyEx() {
		char src[] = "Java Programming".toCharArray(); //char 배열로 변환
		
		// system객체를 이용한 배열의 복사
		char target[] = new char[src.length]; // src배열 길이만큼의 새로운 배열 생성
		System.arraycopy(src, 0, target, 0, src.length); //(원본배열, 시작위치, 복사 대상 배열, 복사 시작위치, 복사할 길이)
		
		System.out.println("target : "+ target);
		System.out.println(Arrays.toString(target)); // 보기 좋게 배열 출력 
		
		
		//  Arrays.copyOf 이용한 복		
		target = Arrays.copyOf(src,  src.length);
		System.out.println("Arrays.copyOf 활용 복제 : " + Arrays.toString(target));
		
		// 일부 복제
		target = Arrays.copyOfRange(src, 5, 11);
		System.out.println("일부복제 복제 : " + Arrays.toString(target));
	}

}
