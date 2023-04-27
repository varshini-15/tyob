package com.ob.mapings.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Parent

import lombok.Data;

@Data
@Entity
@Table
public class Student1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;

	@ManyToOne(cascade = CascadeType.ALL)
	private Department studentDept;
	
}
