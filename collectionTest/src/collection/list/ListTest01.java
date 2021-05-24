package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest01 {
	
	public static void main(String[] args) {
		//List list = new ArrayList(); Java 4까지
		
		//Java 5버전 이상
		//타입파라미터
		List<String> list = new ArrayList<>();
		
		//삽입
		//String이 없기때문에 숫자만 들어갈수는 없다..
		list.add("문자열"); 		//0
		list.add("문자열2");		//1
		list.add("문자열3");		//3
		list.add(2,"문자열4");	//2 -< 중간에 삽입된다.
		
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("----------");
		//삭제
		list.remove(0);
		
		//수정
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("----------");
		list.set(1, "수정된 문자열");
		//읽기
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------");
		
		String[] strs= {"자바", "JSP" ,"SPRING"};
		List<String> list1=Arrays.asList(strs);
		
		for(String str:list1) {
			System.out.println(str);
		}
		System.out.println("----------");
		String[] arr=new String[3];
		String[] str2=list1.toArray(arr);
		System.out.println("베열출력");
		for(String str:str2) {
			System.out.println(str);
		}
		System.out.println("----------");
	}

}
