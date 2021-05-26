package generic;

public class ProductTest {

	public static void main(String[] args) {
		
		//타입 파라미터에는 클래스 타입만 허용한다
		// wrapper class -> 클래스
		//int 대신 Integer 사용해야한다..
		//short -> Short
		//char -> Character
		//float -> Float
		//double -> Double
		//long -> Long
		//b -> Boolean
		Product<Integer, String> pro = new Product<>();
		pro.setKey(1);
		pro.setValue("문자열");

	}

}
