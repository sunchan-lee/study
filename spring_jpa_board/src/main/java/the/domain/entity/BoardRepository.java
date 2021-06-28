package the.domain.entity;

import org.springframework.data.jpa.repository.JpaRepository;

//board에서 접근 가능한-Repository
public interface BoardRepository extends JpaRepository<Board, Long>{
	

}
