package inheritance03;




public interface Inter01 {

}

//인터페이스 대 인터페이스 extends 키워드로 확장 가능합니다
interface Inter02 extends Inter01{
	
}
//다중상속 가능합니다.
interface Inter03 extends Inter02, Inter04{
	
}

interface Inter04{
	
}

