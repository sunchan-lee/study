package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Test<T>{
	T title;
}

public class LinkedListTest {
	public static void main(String [] args) {
		//vector,, arraylist와 사용법이 동일하다. (인덱스로 데이터 관리)
		//하지만 구조가 다르다.(인접하는 참조 데이터로 관리)
		//데이터 삽입, 삭제시 용이하다.
		//검색은 느립니다.
		
		//String 이면 문자열, Integer이면 숫자만 넣어야한다.
		
		Test<String> test=new Test<>();
		test.title="문자";
		
		List<String> list1=new ArrayList<>();
		List<String> list2=new LinkedList<>();
		
		long start;
		long end;
		
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " +(end-start) );
		
		
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " +(end-start) );
		
	}

}
