package generic;

import java.util.ArrayList;
import java.util.List;

class Person{
	String name;
	int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

class Board{
	String title;
	String content;
}

public class Test01 {

	public static void main(String[] args) {
		
		//리스트 생성
		List list=new ArrayList();
		
		//데이터 추가 저장
		list.add("문자열");
		list.add(Integer.valueOf(10));
		list.add(3.14);
		list.add(100);
		list.add(200);
		list.add("문자열2");
		
		//문자형으로 강제 형변환을 해줘야한다..
		String str=(String) list.get(0);
		//숫자형으로 강제 형변환을 해줘야한다..
		Integer n1=(Integer) list.get(1);
		Double d1=(Double) list.get(2);
		
		//한번에 다 나온다.
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("==========");
		Person person = new Person("이름", 10);
		
		List list2 = new ArrayList();
		list2.add(person);
		list2.add(new Person("이름2", 20));
		//list2.add(new Board());
		
		System.out.println("==========");
		for(Object obj:list2) {
			//이름을 갖고 오려면 앞에  PErson 데이터를 갖고온다ㅣ..
			Person p = (Person)obj;
			System.out.println(p.name + ":" + p.age);
			
			//System.out.println(obj);
			//이대로 출력하면 해시코드가 안온다..
		}
		
		System.out.println("==========");
		List<Person> list3 = new ArrayList();
		list3.add(person);
		list3.add(new Person("이름2", 20));
		for(Person p:list3) {
			System.out.println(p.name + ":" + p.age);
		}
		System.out.println("==========");
		
		//클래스도 담고,, 문자열도 담을수 있다..
		//데이터 타입이 오브젝트라서 모든 데이터 타입을 허용한다..
		
		Box box = new Box();
		box.setObj(new Apple());
		
		//강제 캐스팅을 해야한다..
		Apple apple= (Apple) box.getObj();
		
		Box box1 = new Box();
		box1.setObj("사과");
		
		//강제 캐스팅을 해야한다..
		String str1=(String) box1.getObj();
		Apple a = new Apple();
		NewBox<Apple> newBox=new NewBox<>();
		newBox.setT(a);
		
		Apple a1 = newBox.getT();
		
		
		

	}
}
