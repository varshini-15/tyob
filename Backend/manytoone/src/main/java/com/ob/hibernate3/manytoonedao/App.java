package com.ob.hibernate3.manytoonedao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ob.hibernate3.manytoonedto.Department;
import com.ob.hibernate3.manytoonedto.Student1;



public class App {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manoj");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	Department department = new Department();
	department.setDeptName("IT");
	
	
	Student1 student11 = new Student1();
	student11.setStudentName("Varshini");
	student11.setStudentDept(department);
	entityManager.persist(student11);
	Student1 student12 = new Student1();
	student12.setStudentName("Meera");
	student12.setStudentDept(department);
	entityManager.persist(student12);
//	List<Student1> students1 = new ArrayList<Student1>();
//	students1.add(student11);
//	students1.add(student12);
	
//	entityManager.persist(students1);
	entityTransaction.commit();
	entityManager.close();
	entityManagerFactory.close();
	
	
		
	}
}
