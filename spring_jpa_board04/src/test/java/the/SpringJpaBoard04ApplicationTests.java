package the;

import java.util.stream.IntStream;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import the.domain.entity.Board;
import the.domain.entity.BoardRepository;
import the.domain.entity.Reply;
import the.domain.entity.ReplyRepository;

@SpringBootTest
class SpringJpaBoard04ApplicationTests {

	@Autowired
	BoardRepository boardRepository;
	@Autowired
	ReplyRepository replyRepository;
	
	
	//@Test
	void 게시글생성() {
		IntStream.rangeClosed(1, 5).forEach(i->{
			boardRepository.save(Board.builder().subject("게시글"+i).build());
		});
	}
	
	//Entity로 접근해야한다.
	//@Test
	void 댓글생성() {
			//IntStream.rangeClosed(1, 3).forEach(i->{					//Board객체
			replyRepository.save(Reply.builder()
					.content("댓글2")
					.board(Board.builder().no(2L).build())
					.build());
		//});
	}
	
	@Transactional
	@Test
	void 상세게시글조회() {
		Board entity = boardRepository.findById(1L).get();
		System.out.println(entity.toString());
	}

}
