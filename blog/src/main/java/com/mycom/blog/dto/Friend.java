package com.mycom.blog.dto;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.boot.context.properties.bind.DefaultValue;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.IntSequenceGenerator;
import com.mycom.blog.dto.enumtype.AuthType;
import com.mycom.blog.dto.enumtype.FriendType;
import com.mycom.blog.dto.enumtype.RoleType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor

@SequenceGenerator(name = "FRIEND_SEQ_GEN", // 시퀀스 제너레이터 이름
		sequenceName = "FRIEND_SEQ", // 시퀀스 이름
		initialValue = 1, // 시작값
		allocationSize = 1 // 메모리를 통해 할당할 범위 사이즈
)
@Builder
@Table(name = "Friend")
@Entity // user클래스가 자동으로 테이블을 생성
@ToString(exclude = {"me","user","fromWho" })
@JsonIdentityInfo(generator = IntSequenceGenerator.class, property = "id")
public class Friend {

	@Id // primarykey
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FRIEND_SEQ_GEN")
	private int friend_no; // 시퀀스 auto_increment

	@OneToOne(fetch = FetchType.EAGER)
	private User user;

	@OneToOne
	private User fromWho;
	
	@Enumerated(EnumType.STRING)
	private FriendType friendType = FriendType.REQUEST;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userno")
	private User me;
	
	@CreationTimestamp // 시간이 자동입력
	private Timestamp createDate;
	

}
