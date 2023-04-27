package com.ob.employee.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ob.hibernatedemo.dto.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("empdemo");
		System.out.println(entitymanagerfactory);
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		System.out.println(entitymanager);
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		System.out.println(entitytransaction);
		entitytransaction.begin();

		// Employee employee = new Employee();
		// employee.setEmployeeId(1);
		// employee.setEmployeeName("Varshini");
		// employee.setEmployeeSalary(1000.00);
		// employee.setEmployeePhoneNo(12345);

		// Employee employee1 = new Employee();
		// employee1.setEmployeeId(2);
		// employee1.setEmployeeName("Meera");
		// employee1.setEmployeeSalary(11111.00);
		// employee1.setEmployeePhoneNo(34212);
		//
		// entitymanager.persist(employee);
		// entitymanager.persist(employee1);
		
//		Query query = entitymanager.createQuery("from Employee");
//		List<Employee> employee = query.getResultList();
//		for (Employee employees : employee) {
//			System.out.println(employees.getEmployeeName());
//		}
//		System.out.println("SingleResult==");
//		
//		Query query1 = entitymanager.createQuery("from Employee where employeeId = 100");
//		Employee employee1 = (Employee) query1.getSingleResult();
//		System.out.println(employee1.getEmployeeName());
//		
//		System.out.println("Aggregation==");
//		Query query2 = entitymanager.createQuery("select count(employeeId) from Employee");
//		Long employee2 = (Long) query2.getSingleResult();
//		System.out.println(employee2);
//		
//		Query query3 = entitymanager.createQuery("select avg(employeeSalary) from Employee");
//		Double employee3 = (Double) query3.getSingleResult();
//		System.out.println(employee3);
		
//		Query query4 = entitymanager.createQuery("FROM employee_info WHERE employeeName REGEXP '^[vl]'");
//		List<Employee> employee4 = query4.getResultList();
//		for (Employee employees : employee4) {
//			System.out.println(employees.getEmployeeName());
//		}
//		
//		Query query4 = entitymanager.createQuery("select current_timestamp");
//		Date employee4 = (Date) query4.getSingleResult();
//		System.out.println(employee4);
		
//		Query query4 = entitymanager.createQuery("select employeeName from Employee where employeeId between 102 and 104");
//		List<String> employee4 = query4.getResultList();
//		for (String employees : employee4) {
//			System.out.println(employees);
//		}
//		
//		Query query5 = entitymanager.createQuery("select employeeName from Employee where employeeId in (103,105)");
//		List<String> employee5 = query5.getResultList();
//		for (String employees : employee5) {
//			System.out.println(employees);
//		}
//		
//		Query query6 = entitymanager.createQuery("select employeeName from Employee order by employeeName");
//		List<String> employee6 = query6.getResultList();
//		for (String employees : employee6) {
//			System.out.println(employees);
//		}
//		
//		Query query7 = entitymanager.createQuery("select employeeName from Employee order by employeeName DESC");
//		List<String> employee7 = query7.getResultList();
//		for (String employees : employee7) {
//			System.out.println(employees);
//		}
		
		
		entitytransaction.commit();
		entitymanager.close();
		entitymanagerfactory.close();

	}
}
