package the;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import the.domain.entity.Board;
import the.domain.entity.BoardRepository;
import the.domain.entity.File;

@SpringBootTest
class SpringJpaBoardApplicationTests {
	
	@Autowired
	BoardRepository repository;

	@Test
	void 게시글생성() {
		Board entity = Board.builder()
				.subject("제목1")
				.content("내용1")
				.writer("작성자1")
				.build();
		
		File file1=File.builder()
				.fileName("파일이름.txt")
				.fileSize("1234")
				.fileUrl("/file/test")
				.build();
		entity.addFile(file1);
		
		File file2=File.builder()
				.fileName("파일이름2.txt")
				.fileSize("234")
				.fileUrl("/file/test")
				.build();
		entity.addFile(file2);
		
		repository.save(entity);
		
	}

}
