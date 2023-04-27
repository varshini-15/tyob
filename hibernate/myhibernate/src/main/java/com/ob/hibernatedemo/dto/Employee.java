package com.ob.hibernatedemo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_info")
public class Employee {
	@Id
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private int employeePhoneNo;

}
