package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person{
	String name;
	String phone;
	public Person(String name, String phone) {
		this.name=name;
		this.phone=phone;
	}
}



public class HashMapTest {

	public static void main(String[] args) {
		
		List<Person> list=new ArrayList<>();
		
		list.add(new Person("이름1", "전화1"));
		list.add(new Person("이름2", "전화2"));
		list.add(new Person("이름3", "전화3"));
		
		
		Map<String, List<Person>> map=new HashMap<>();
		Map<String, List<Person>> map2=new HashMap<>();
		map.put("회원명단", list);
		
		List<Person> getData=map.get("회원명단");
		
		for(Person person:getData) {
			System.out.println(person);
		}
		
	}

}
