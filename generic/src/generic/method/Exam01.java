package generic.method;

import java.awt.Container;

class Container<T>{

	private String s;
	private Integer i;
	private Double d;

	public Object getT() {
		return getT();
	}
	
	public void setT(String s, Integer i, Double d) {
		this.s=s;
		this.d=d;
		this.i=i;
	}
	
}

public class Exam01 {

	public static void main(String[] args) {
		
		Container<String> con=new Container<>();
		con.setT("자바");
		String str=con.getT();
		
		Container<Integer> con2=new Container<>();
		con2.setT("자바");
		Integer str2=con2.getT();
		
		Container<Double> con3=new Container<>();
		con3.setT("자바");
		Integer str3=con3.getT();

	}

}
