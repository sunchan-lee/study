package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		//String 문자열 저장 
		//지정을 안하면 모든 데이터를 저장할수 있으나, 관리하는 측면에서 어려움이 생긴다.
		//혼합 데이터를 넣고 싶으면 class로 만들면 된다.
		//저장순서가 없기때문에 수정이라는 개념이 없다.
		
		//Set<String>이나 HashSet<String>이나 앞쪽에 어느쪽 상관없다.
		Set<String> set=new HashSet<>();	
		HashSet<String> set2=new HashSet<>();	
		
		//set 문자열 추가
		set.add("문자열1");
		set.add("문자열2");
		set.add("문자열3");
		set.add("문자열4");
		set.add("문자열1");
		
		System.out.println(set.size());
		//출력 결과 - 중복을 허용하지 않기때문에 4개로 나온다
		System.out.println("=================");
		
		set.remove("문자열2");
		
		for(String str:set) {
			System.out.println(str);
		}
		
		//출력결과 - 저장 순서를 유지하지 않는다.
		//문자열 4
		//문자열 3
		//문자열 1
		
		
		System.out.println("=================");
		//iterator 객체를 통해서 추출이 가능하다.
		//근데 굳이 쓸일이 없다. 개념만 알자.
		//MAP 개열에서는 사용할수 있겠다.
		//외부 iterator
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		System.out.println("=================");
		//내부 iterator
		set.stream().forEach(str->{
			System.out.println(str);
		});
		
		
		//set2 문자열 추가
		set2.add(new String ("문자열1"));
		set2.add(new String ("문자열2"));
		set2.add(new String ("문자열3"));
		set2.add(new String ("문자열1"));
		
		System.out.println(set2.size());
		//출력결과 - 중복을 허용하지 않기때문에 3개로 나온다
		

	}

}
