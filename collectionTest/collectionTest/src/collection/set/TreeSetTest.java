package collection.set;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<>();
		
		//넣는 방법은 기존 세트와 동일하다.
		
		set.add(1);
		set.add(13);
		set.add(32);
		set.add(24);
		set.add(5);
		set.add(16);
		
		//순서를 마구잡이로 넣었지만
		//출력은 순서대로 나온다. 1, 5, 13, 16, 24, 32
		
		for(Integer num:set) {
			System.out.println(num);
		}
		
		//검색 관련 메서드 제공
		System.out.println("최소값 : " + set.first() );
		
		System.out.println("최대값 : " + set.last() ); 
		
		Integer n=set.lower(10);	//10 바로 아래의 정수
		System.out.println("10점 아래 : " + n  );
		
		n=set.higher(10);			//10 바로 위의 정수
		System.out.println("10점 위 : " + n  );
		
		
		
		NavigableSet<Integer> desc = set.descendingSet();
		for(Integer num: desc) {
			System.out.println(num);
		}
		
		
		System.out.println("30이거나 바로 아래 : " + set.floor(30));
		System.out.println("30이거나 바로 위 : " + set.ceiling(30));
		System.out.println(set.size());
		
		//비어있으면....
		while(!set.isEmpty()) {
			System.out.print(set.pollLast()); //읽어들이고 제거
			System.out.println("남은개수 : " + set.size());
		}

	}

}
