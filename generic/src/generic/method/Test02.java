package generic.method;

import java.util.Optional;

import generic.NewBox;

public class Test02 {

	public static void main(String[] args) {
		
		NewBox<String> box=Util.boxing("문자열");
		
		NewBox<Integer> box1=Util.boxing(10);
		NewBox<Double> box2=Util.boxing(3.14);
		
		Pair<Integer, String> p1=new Pair<Integer, String>(1, "자바");
		Pair<Integer, String> p2=new Pair<Integer, String>(2, "자바");
		
		boolean result=Util.compare(p1, p2);
		System.out.println(result);
		
		//Optional<String> a;
		//Util.compare("a", "b");
		int result2=Util.compare(10,10);
		System.out.println(result2);

	}

}
