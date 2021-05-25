package collection.list;

import java.util.List;
import java.util.Vector;

class Board{
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
}

public class VectorTest {
	
	public static void main(String [] args) {
		
		//List<board> list=new Vector<Board>();
		List<Board> list=new Vector<>();		//생성자의 타입 파라미터는 생략 가능 <>는 표현해야한다.
		Board board = new Board("제목", "내용1", "작성자1");
		list.add(board);
		list.add(board);
		list.add(board);
		list.add(board);
		list.add(null);
		
		System.out.println(list.size()); 
		//출력 결과사이즈 4개가 나온다.
		//중복 데이터도 저장이 가능합니다.
		//null도 허용한다.
		
		//synchronized 메서드로 구성되어있어서 멀티 스레드상에서 안전하다.
		//ArrayList와 동일합니다.
		
		//관계 데이터베리스에서 하나의 속성이 취할수 있는 값의 집합.
		//DTO, Entity.
		
		
	}

}
