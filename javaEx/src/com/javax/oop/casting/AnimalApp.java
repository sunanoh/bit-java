package com.javax.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
	
		Dog d1 = new Dog("������");
		// ��ü ���� ������ �ڱ� �ڽ�
		// ���� �ִ� ��� ����� Ȱ�� ����
		d1.bark(); // �ڱ� �ڽ��� �޼ҵ�
		d1.eat();  // �θ�Ŭ������ �޼ҵ�
		d1.walk(); // �θ�Ŭ������ �޼ҵ�
		
		Animal d2 = new Dog("�α�");
		// �ڽ� ��ü�� �θ� Ÿ������ �����ϴ� ��
		// -> Upcasting
		d2.eat(); // �θ� ���� Ÿ�Կ� ����
		d2.walk(); // �θ� ���� Ÿ�Կ� ����
		//d2.bark(); // �θ� ���� Ÿ�Կ� ���� --> ���赵�� �ִ� �͸� ��� ����
		
		((Dog)d2).bark(); // �ٿ�ĳ����
		
		// ��ü ���ɼ�(������)
		Dog pet = new Dog("����");
		pet.eat();
		pet.walk();
		
		// ���� �ֿϵ����� �Ծ�
		//pet = new Cat("�����"); // ��ü�� ��, ������ 24�ٿ��� �̹� dogŸ������ �ع��ȱ� ������ cat �������� ���� �Ұ���
		System.out.println("==========================================");
		// ����, ���ʿ� animal������������ ����
		// 24���� �Ʒ��� ���� �ٲٸ�
		Animal pet2 = new Dog("����");
		pet2.eat();
		pet2.walk();

		pet2 = new Cat("�����");
		pet2.eat();
		pet2.walk();
		
		// ¢�ų� Ȥ�� �߿��� �ϰ� �ϰ� �ʹٸ�
		// �ٿ� ĳ���� ��, ���� ���θ� �Ǵ� : instanceof ������ Ȯ�� �ʿ�
		
		if(pet2 instanceof Dog) {
			// �����ϰ� �ٿ� ĳ���� ������
			((Dog)pet2).bark();
		}else if(pet2 instanceof Cat) {
			// �����ϰ� �ٿ� ĳ����
			((Cat)pet2).meow();
		}
		
		
	}

}
