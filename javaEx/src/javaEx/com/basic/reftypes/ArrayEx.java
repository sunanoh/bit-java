package javaEx.com.basic.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		
		//arrayBasic();
		//arrayMemoryTest();
		//arrayNDim();
		arrayCopy();
		
	}
	public static void arrayCopySystem() {
		// System ��ü�� �̿��� �迭�� ����
		
		int scores[] = {90, 80, 70};
		int target[] = new int[10];
		
		System.arraycopy(scores, // �����迭
				         0, // ���� �迭 ���� ���� �ε��� 
				         target, // ��� �迭
				         3, // ��� �迭 �� ���� ���� �ε���
				         scores.length); // ���� ������ ����
		
		// loop �����鼭 ������ Ȯ��
		// Enhanced for
		
		for(int value : target) {
			
		}
	}
	
	public static void arrayCopy() {
		// �迭�� ũ�� ������ �ȵǱ� ������
		// �߰������� ���� ��� �� �迭 ���� �� ����
		
		int scores[] = {90, 80, 70};
		// ���� 7���� �߰�
		int target[] = new int[10];
		
		// ���� ����
		for(int i = 0; i < scores.length; i++) {
			target[i] = scores[i];
		}
		
		for (int i = 0; i < target.length ; i++) {
			System.out.print(target[i] + " ");
		}
		System.out.println("");
	}
	
	public static void arrayNDim() {
		// 2���� �迭�� ����
		int[][] twoDim = new int[3][5]; // 3�� 5��
		
		// �⺻ �����Ͱ� ���� ���
		int table[][] = {
				{1, 2, 3, 4, 5},  // �̰� table[0]��! 
				{2, 3, 4, 5, 6},
				{3, 4, 5, 6, 7}
		};  // 3�� 5���� �迭
		
		System.out.println("table.length: " + table.length);
		// table[0] ~ table[table.length - 1]
		System.out.println("table[0].length: " + table[0].length); // ù��° ���� ���̴�? �ǹ�
		
		
		// ������ ���鼭 �ش� �迭 ������ ��� ���� �ջ�
		int sum = 0;
		int subtotal = 0;
		
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j<table[i].length; j++) {
				System.out.print(table[i][j] + "\t");
				subtotal += table[i][j];
			}
			System.out.printf("%d���� �ջ� : %d%n",i, subtotal);
			sum += subtotal;
			subtotal = 0;
		}
		System.out.print("table �迭�� ��ü ���� : " + sum);
		
		
	}
	
	public static void arrayMemoryTest() {
		// ���� �ڷ����� �޸� ������ �� �����ؾ� ��
		
		int scores[] = {80, 90, 100, 70};
		
		int scores2[] = scores;
		System.out.println("score2 ���� : "+ scores2.length);
		System.out.println("score2�� 0�� �� : "+ scores2[0]);
		
		System.out.println("scores�� scores2�� ���� ��ü? " + (scores == scores2));
		
		scores[0] = 100; //scores �迭�� ������
		System.out.println("score2�� 0�� �� : "+ scores2[0]);
	}
	
	public static void arrayBasic() {
		// ���ڿ� �迭 : names -> ������ �� �ʱ�ȭ
		// float �迭 : heights -> ����� ���ÿ� ��
		// int �迭 : scores -> ��迭 ���� �� ä���
		
		String[] names; // = String names[]
		int scores[]; // = int[] scores

		// �ʱ�ȭ
		names = new String[] {"ȫ�浿", "����", "����ġ", "�Ӳ���"};
		
		// ������ �̸� �迭�� ���� �ִٸ�
		// ������ ���ÿ� �� ��츸 ����
		float heights[] = {175.3f, 170.2f, 165.3f, 185.3f};
		
		// ��迭 ���� �� ���� ����
		scores = new int[4];
		// �ε��� ���� : 0 ���� ����
		// ���� : .length
		// * ������ �ε��� == .length -1
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
		// scores[4] = 88; -> �ε��� ����, []���� ���ڴ� �����̸� 0���� ������
		
		
		for(int i = 0; i<scores.length; i++) {
			System.out.printf("%s(%2.f) : ���� = %d%n", names[i], heights[i], scores[i]); 
		}
	}
}
