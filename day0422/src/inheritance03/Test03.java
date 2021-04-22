package inheritance03;


//final 클래스는 상속 불가

public class Test03  {
	

}

//implements 키워드 앞에는 class만  허용
//interface Inter05 implements Test03{} // X

//extends 부모와 자식의 성향이 같다.
//class extends class, interface extends interface interface
//interface Inter05 extends Test03{} // X

class Test05{
	final void disp(){}
}

class Test06 extends Test05{
	//final 메서드는 오버라이드 불가
	//void disp(){}
}

/*class Test07{
	void aaa() {
		Test05 test05=new Test06();
	}
}*/

//class Test08 extends Test07{
	//public void aaa() {
	}
	
}