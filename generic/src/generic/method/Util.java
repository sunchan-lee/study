package generic.method;

import generic.NewBox;

public class Util {
	//제한된 타입 파라미터 <T extends 최상위타입> <T extends Number>
	
	public static <T extends Number> int compare(T t1, T t2) {
		double v1=t1.doubleValue();
		double v2=t2.doubleValue();
		return Double.compare(v1, v2);
	}
	
	public static<K,V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyResult=p1.getKey().equals(p2.getKey());
		boolean valueResult=p1.getValue().equals(p2.getValue());
		return keyResult && valueResult;
	}
	
	
	
	
	
	
	
	public static <T> NewBox<T>  boxing(T t) {
		
		NewBox<T> box = new NewBox<>();
		box.setT(t);
		
		
		return null;
		
	}
	
	//제네릭 메서드 선언 위치는 return타입 앞에 
	//public <타입파라미터, 타입파라미터2> 리턴타입 메서드이름() {}
	
}
