package javaEx.com.basic.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		//usingEnum();
		usingEnum2();

	}
	public static void usingEnum2() {
		// ���� ������ ���� ��
		// SUNDAY -> �޽�
		// MONDAY ~ THURSDAY -> ����
		// FRIDAY -> �ұ�
		// SATURDAY -> ����
		
		WeekDay dow = WeekDay.TUESDAY;
		String act;
		
		switch(dow){
		case SUNDAY:
			act = "�޽�";
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			act = "����";
			break;
		case FRIDAY:
			act = "�ұ�";
			break;
		case SATURDAY:
			act = "����";
			break;
		default:
			act = "?";
		}
		
		System.out.printf("%s���� %s%n",dow.name(),act);
		
	}

	public static void usingEnum() {
		WeekDay dow = WeekDay.TUESDAY;
		
		// ������ ��ü Ȯ��	
		System.out.printf("������ %s(%d)�Դϴ�%n", dow.name(), dow.ordinal());
		// name() -> ���� ����� ���ڿ� ��ȯ
		// ordinal() -> ���Ż���� ����
		
		
		// ���ڿ��� -> ���� �����
		String str = "SUNDAY";
		WeekDay obj = WeekDay.valueOf(str);
		
		System.out.printf("���ڿ� %s�� ���Ż�� %d�Դϴ�%n", str, obj.ordinal());
	}
}
