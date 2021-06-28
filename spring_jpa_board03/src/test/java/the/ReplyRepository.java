package the;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import the.domain.entity.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long>{

	List<Reply> finByBoardNo(long bno);

}
