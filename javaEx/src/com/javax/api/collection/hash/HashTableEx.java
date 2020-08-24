package com.javax.api.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableEx {

	public static void main(String[] args) {
		// HashMap : Map 형 자료형
		// key - 값의 쌍으로 데이터를 관리
		// key는 중복될 수 없음(*)
		
		Hashtable<String, Classroom> map = new Hashtable<>();
		
		map.put("101", new Classroom("R101", "Java"));
		map.put("202", new Classroom("R202", "C"));
		map.put("303", new Classroom("R303", "Python"));
		map.put("404", new Classroom("R404", "Linux"));
		
		System.out.println("MAP : " + map);
		
		// 데이터 가져오기 : get
		System.out.println("303강의실의 강의 : " + map.get("303"));
		
		// 데이터 변경 : put (이미 있는 KEY면, 데이터 덮어쓰기)
		map.put("202", new Classroom("R202", "C#"));
		System.out.println("MAP : " + map);
		
		// 키가 있는 지 확인 : containsKey()
		System.out.println("키에 202 가 있는가 ? : " + map.containsKey("202"));
		System.out.println("키에 501 이 있는가 ? : " + map.containsKey("501"));
		
		// 값의 검색
		System.out.println("Java : " + map.containsValue("Java")); // false임, 우리 value는  classroom임!
		System.out.println("Java 강의 포함? : " + map.containsValue(new Classroom("Java")) );
		// --> hashcode, equals가 적절히 오버라이드 되어있어야 정상 작동함. 
		
		
		// Iterator를 이용한 자료의 순회
		Iterator<String> it = map.keySet().iterator(); // 우리자료는 string형으로...
		
		while(it.hasNext()) { // 뒤에 내용이 더 있는가?
			Classroom room = map.get(it.next());
			System.out.println("강의실 : " + room);
		}
		
		map.clear();
		System.out.println("MAP : " + map);
	}

}
