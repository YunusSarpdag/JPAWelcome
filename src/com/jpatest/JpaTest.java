package com.jpatest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.model.Personel;

public class JpaTest {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory;
		EntityManager entityManager;

		Personel personel = new Personel();
		//personel.setPersonelID(1);
		personel.setPersonelName("Ahmet");
		personel.setPersonelSurename("DD");
		
		
		Personel personel2 = new Personel("Ali", "Desidero");
		Personel personel3 = new Personel("Veli", "Desidero");

		entityManagerFactory = Persistence.createEntityManagerFactory("002_JPA_Welcome"); // persistence-unit
		entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.persist(personel);
			entityManager.persist(personel2);
			entityManager.persist(personel3);
			entityTransaction.commit();
		} catch (Exception e) {
			entityTransaction.rollback();
		} finally {
			if(entityManager != null) {
				Query query = entityManager.createNamedQuery("getAllPersonel");
				List<?> list = query.getResultList();
				
				list.forEach(a -> System.out.println(((Personel)a).getPersonelName()));
				
				Query query2 = entityManager.createNamedQuery("getSelectyedPersonelByName").
						setParameter("personelName", "Ahmet");
				List<?> list2 = query2.getResultList();
				
				list2.forEach(a -> System.out.println("test2 " +((Personel)a).getPersonelName()));
				
				entityManager.close();
				entityManagerFactory.close();
			}
		}
		

	}
}
