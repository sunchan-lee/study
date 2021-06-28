package the.domain.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name = "board_jpa")
@Entity
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;
	
	@Column(nullable = false)
	private String subject;
	@Column(nullable = false)
	private String content;
	@Column
	private String writer;
	@Column
	private int readCount;
	
	@CreatedDate
	@Column
	private LocalDateTime createdDate;
	
	@LastModifiedDate
	@Column
	private LocalDateTime updatedDate;
	
	//One to Many Table 생성시-
	//Hibernate: create table board_jpa (no bigint not null auto_increment, content varchar(255) not null, created_date datetime, read_count integer, subject varchar(255) not null, updated_date datetime, writer varchar(255), primary key (no)) engine=InnoDB
	//NO값을 이용한 "연결 테이블" Hibernate: create table board_jpa_files (board_no bigint not null, files_fno bigint not null) engine=InnoDB
	//Hibernate: create table file_jpa (fno bigint not null auto_increment, file_name varchar(255) not null, file_size varchar(255) not null, file_url varchar(255) not null, primary key (fno)) engine=InnoDB
	
	//@JoinColumn 생성시
	//Hibernate: create table board_jpa (no bigint not null auto_increment, content varchar(255) not null, created_date datetime, read_count integer, subject varchar(255) not null, updated_date datetime, writer varchar(255), primary key (no)) engine=InnoDB
	//Hibernate: create table file_jpa (fno bigint not null auto_increment, file_name varchar(255) not null, file_size varchar(255) not null, file_url varchar(255) not null, files_no bigint, primary key (fno)) engine=InnoDB
	//Hibernate: alter table file_jpa add constraint FKthpt25gnagxw1cb90xssvrsfu foreign key (files_no) references board_jpa (no)
	
	//@JoinColumn(name = "bno") 생성시
	//Hibernate: create table board_jpa (no bigint not null auto_increment, content varchar(255) not null, created_date datetime, read_count integer, subject varchar(255) not null, updated_date datetime, writer varchar(255), primary key (no)) engine=InnoDB
	//Hibernate: create table file_jpa (fno bigint not null auto_increment, file_name varchar(255) not null, file_size varchar(255) not null, file_url varchar(255) not null, bno bigint, primary key (fno)) engine=InnoDB
	//Hibernate: alter table file_jpa add constraint FK4qjcchafo0ybw0f34sf5iyy82 foreign key (bno) references board_jpa (no)
	
	//File측(Entity)에서 접근은 불가능하다.
	//column이 있어도 접근이 불가능하다.
	//Class 기준으로 보자.
	//단방향 One Way
	//Board 통해서만 접근이 가능하다.
	
	// 1대 다 기준. // 1 : N
	//JPA는 하나의 테이블에 여러 데이터을 저장하기위해 별도의 테이블을 만든다.
	//cascade - 영속성
	//이미 존재하는 테이블에 컬럼을 추가한다.
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "bno")
	@Builder.Default
	private List<File> files=new ArrayList<>();
	
	public void addFile(File file) {
		files.add(file);
	}
	
	//CascadeType.ALL - 모든 변경에 대한 전이한다.
	//CascadeType.PERSIST - 저장할때만 전이한다.
	//CascadeType.MERGE - 병합할때만 전이한다.
	//CascadeType.REMOVE - 삭제 할때만 전이한다.
	//CascadeType.REFRESH - Entity 매니저의 refresh()호출시 전이
	//CascadeType.REFRESH - 부모 Entity가 detach되면, 자식 엔티티 역시 detach 된다.
	
	
}
