package the;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import the.domain.entity.Board;
import the.domain.entity.BoardRepository;
import the.domain.entity.File;
import the.domain.entity.FileRepository;

@SpringBootTest
class SpringJpaBoard02ApplicationTests {

	@Autowired
	FileRepository fileRepository;
	
	@Autowired
	BoardRepository repository;
	
	
	@Test
	void 데이터삽입() {
		Board board = Board.builder()
				.subject("제목3")
				.build();
		repository.save(board);
		
		//System.out.println(board.getNo());
		
		File file1 = File.builder()
				.filename("aaa.text")
				.board(board)
				.build();
		fileRepository.save(file1);
		
		File file2 = File.builder()
				.filename("aaa.text")
				.board(board)
				.build();
		fileRepository.save(file2);

		File file3 = File.builder()
				.filename("aaa.text")
				.board(board)
				.build();
		fileRepository.save(file3);

		
		
		
	}

}
