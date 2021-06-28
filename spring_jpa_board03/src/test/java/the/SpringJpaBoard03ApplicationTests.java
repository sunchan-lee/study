package the;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import the.domain.entity.Board;
import the.domain.entity.Reply;

@SpringBootTest
class SpringJpaBoard03ApplicationTests {

	@Autowired
	BoardRepository repository;
	
	@Autowired
	ReplyRepository replyRepository;
	
	//@Test
	void 게시글생성() {
		IntStream.rangeClosed(1, 10).forEach(i->{
			repository.save(
					Board.builder()
					.subject("게시글" + i)
					.build());
		});
		
		
	}
	
	//@Test
	void 댓글생성() {
		Reply re = Reply.builder()
				.content("댓글2")
				.board(Board.builder().no(1L).build())
				.build();
		
		replyRepository.save(re);
	}
	@Test
	void 상세게시글() {
		Board entity = repository.findById(1L).get();
		System.out.println(entity);
		long bno = entity.getNo();
		replyRepository.finByBoardNo(bno).stream().forEach(re->{
			System.out.println(re);
		});
	}

}
