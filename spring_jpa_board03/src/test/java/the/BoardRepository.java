package the;

import org.springframework.data.jpa.repository.JpaRepository;

import the.domain.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
