package the.domain.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

//ToString 테스트 할꺼면, 한쪽만 할것!
@ToString//(exclude = "replies")
@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;
	@Column(nullable = false)
	private String subject;
	
	//@OneToMany = 연계테이블이 만들어지는 이유.
	//연계테이블은 되도록이면 사용하지 말자.
	//LAZY 와 EAGER의 속도 차이
	@OneToMany(mappedBy = "board", fetch = FetchType.LAZY) 
	List<Reply> replies;
	
	
}
