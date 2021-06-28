package the.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

//ToString 테스트 할꺼면, 한쪽만 할것!
@ToString(exclude = "board")
@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Reply {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long rno;
	
	@Column(nullable = false)
	private String content;
	
	
	@ManyToOne
	@JoinColumn(name = "bno")
	Board board;
}
