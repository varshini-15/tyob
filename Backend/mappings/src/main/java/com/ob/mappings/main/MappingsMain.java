package com.ob.mappings.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ob.mappings.student.Capital;
import com.ob.mappings.student.Country;

public class MappingsMain {
//	public static void main(String[] args) {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mappings");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin();
//		
//		Country country = new Country();
//		country.setCountryName("India");
//		country.setStatecount(28);
//		
//		Capital capital1 = new Capital();
//		capital1.setCapitalName("Delhi");
//		
//		Capital capital2 = new Capital();
//		capital2.setCapitalName("Bangalore");
//		
//		List<Capital> capitals = new ArrayList<Capital>();
//		capitals.add(capital1);
//		capitals.add(capital2);
//		country.setCapital(capitals);
//		entityManager.persist(country);
//		entityTransaction.commit();
//		entityManager.close();
//		entityManagerFactory.close();
//				
//		
//		
//
//	}
}
