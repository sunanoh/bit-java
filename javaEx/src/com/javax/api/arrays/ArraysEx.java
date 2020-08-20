package com.javax.api.arrays;
import java.util.Arrays;
import java.util.Collections;

// Arrays ��ƿ��Ƽ Ŭ����
// �迭�� ����
// �迭�� ����(sort)
// �迭�� �˻�

public class ArraysEx {

	public static void main(String[] args) {
		//arrayCopyEx();
		//basicSortTest();
		//basicSortDescendingTest();
		//customSortEx();
		//basicSearc();
		customSearch();
	}
	// ����� ���� �ڷ����� �˻�
	private static void customSearch() {
		Member[] mem = {new Member("ȫ�浿"), new Member("��浿"), new Member("�Ӳ���"), new Member("����")};
		
		System.out.println("���� �迭 : "+ Arrays.toString(mem));
		Arrays.sort(mem);
		System.out.println("���ĵ� �迭 : "+ Arrays.toString(mem));
		int index = Arrays.binarySearch(mem, new Member("����")); 
		// ����� ���� ��ü�� �˻��ÿ��� ��ü�� �Ѱ��־� �ش� ��ü�� ������ ������� �Ѵ�. 
		System.out.println("�˻��� �ε���: "+index);
	}
	
	// �˻� �׽�Ʈ
	private static void basicSearc() {
		// java�� �⺻������ binary search ����� ä���� 
		// binary search : ���ĵ� �迭�� ������ �ɰ� ��, �߰������� ���� ��/������ ���� ���ذ��� ��� �� ã��
		// �̸� �����Ͱ� ���� �Ǿ� �־�� �Ѵ�
		
		// �⺻ �ڷ��� �˻�
		int num[] = {5, 6, 2, 1, 3, 7, 9, 8, 4};
		System.out.println("���� �迭: "+ Arrays.toString(num));
		Arrays.sort(num); // ���̳ʸ� �˻� ������ ������ �Ǿ� �־�� �Ѵ�.
		int index = Arrays.binarySearch(num, 3);
		System.out.println("3�� �ε��� : "+index);
		
		// ���� Ÿ���� �˻�
		String[] items = {"Java", "C", "C++", "Python", "Linux"};
		System.out.println("���� �迭: "+ Arrays.toString(items));
		// �̸� �����Ͱ� ���ĵǾ� �־�� �Ѵ�.
		Arrays.sort(items);
		System.out.println("���ĵ� �迭 : "+ Arrays.toString(items));
		int index2 = Arrays.binarySearch(items, "Linux");
		System.out.println("Linux�� �ε��� : "+ index2);
		
		
	}
	
	// ����� ���� ����
	private static void customSortEx() {
		// Member ��ü�� �迭 ����
		Member[] mem = {new Member("ȫ�浿"), new Member("��浿"), new Member("�Ӳ���"), new Member("����")};
		
		System.out.println("���� �迭: "+ Arrays.toString(mem));
		Arrays.sort(mem);
		System.out.println("���ĵ� �迭: "+ Arrays.toString(mem));  // -> ���� ����� ��� ������ �� (Member cannot be cast to java.lang.Comparable)
		                                                        //  -> member��ü���� comparable �������̽��� �������ָ� �����
	}
	
	// ��������, ��������(Descending :ū �� -> ���� �� ��)
	private static void basicSortDescendingTest() {
		Integer[] scores = { 80, 50, 75, 90, 70, 88, 76}; // �⺻Ÿ�� int�� �޾Ƶ����� ���ؼ� integer�� ������... ���߿� �ٽ�!
		System.out.println("���� �迭 : " + Arrays.toString(scores));
		
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("�������� : " + Arrays.toString(scores));
	}
	
	// �⺻����, ��������(Ascending : ���� �� -> ū �� ��)
	private static void basicSortTest() {
		int[] scores = { 80, 50, 75, 90, 70, 88, 76};
		System.out.println("���� �迭 : " + Arrays.toString(scores));
		
		// ����
		Arrays.sort(scores);
		System.out.println("�⺻���� : " + Arrays.toString(scores));

	}
	
	
	private static void arrayCopyEx() {
		char src[] = "Java Programming".toCharArray(); //char �迭�� ��ȯ
		
		// system��ü�� �̿��� �迭�� ����
		char target[] = new char[src.length]; // src�迭 ���̸�ŭ�� ���ο� �迭 ����
		System.arraycopy(src, 0, target, 0, src.length); //(�����迭, ������ġ, ���� ��� �迭, ���� ������ġ, ������ ����)
		
		System.out.println("target : "+ target);
		System.out.println(Arrays.toString(target)); // ���� ���� �迭 ��� 
		
		
		//  Arrays.copyOf �̿��� ��		
		target = Arrays.copyOf(src,  src.length);
		System.out.println("Arrays.copyOf Ȱ�� ���� : " + Arrays.toString(target));
		
		// �Ϻ� ����
		target = Arrays.copyOfRange(src, 5, 11);
		System.out.println("�Ϻκ��� ���� : " + Arrays.toString(target));
	}

}
