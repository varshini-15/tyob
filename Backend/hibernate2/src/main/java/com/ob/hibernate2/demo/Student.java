package com.ob.hibernate2.demo;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student_info")


public class Student {
	@Id
	private int studentId;
	private String studentName;
	private String studentDept;
}

