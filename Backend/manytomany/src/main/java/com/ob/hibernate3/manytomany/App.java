package com.ob.hibernate3.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ob.hibernate3.dao.Author;
import com.ob.hibernate3.dao.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manytomany");
    	EntityManager entityManager = entityManagerFactory.createEntityManager();
    	EntityTransaction entityTransaction = entityManager.getTransaction();
    	entityTransaction.begin();
    	
    	Book book = new Book();
    	book.setBookName("CNS");
    	System.out.println("Parent Book : " + book);
    	
    	Author author1 = new Author();
    	author1.setAuthorName("Ferouzan");
    	System.out.println("Author1 : " + author1);
    	Author author2 = new Author();
    	author2.setAuthorName("Fouridge");
    	System.out.println("Author2 : " + author2);
    	
    	List<Author> author = new ArrayList<Author>();
    	author.add(author1);
    	author.add(author2);
    	System.out.println("List Author : " + author.get(0));
    	System.out.println("List Author : " + author.get(1));
    	book.setAuthor(author);
    	System.out.println("Book after setting author");
    	System.out.println(book);
    	entityManager.persist(book);
        System.out.println(entityManager + "--------------");
        
    	Author author3 = new Author();
    	author3.setAuthorName("Varshini");
    	System.out.println("Author3 :" + author3);
    	Book book2 = new Book();
    	book2.setBookName("A Book");
    	System.out.println("book2 :" + book2);
    	Book book3 = new Book();
    	book3.setBookName("B Book");
    	System.out.println("book3 :"+book3);
    	List<Book> books = new ArrayList<Book>();
    	books.add(book2);
    	books.add(book3);
    	System.out.println("books :"+books);
    	author3.setBook(books);
    	System.out.println("author3 :"+author3);
    	entityManager.persist(author3);
    	
    	//CRUD Operations
//    	Book bk = entityManager.find(Book.class, 1);
//    	System.out.println(bk.getBookName());
    	//read
//    	System.out.println(entityManager.find(Book.class, 1).getBookName());
//    	//update
//    	Book bkchange =  entityManager.find(Book.class, 1);
//    	bkchange.setBookName("CNS Changed Name");
//    	System.out.println(bkchange.getBookName());
//    	System.out.println(author3);
//    	//reflection in child
//    	System.out.println(author3.getBook().get(1).getBookName());
//    	
    	entityTransaction.commit();
    	entityManager.close();
    	entityManagerFactory.close();
    }
}
