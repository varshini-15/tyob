package com.ob.interfaces.exercises;
//class inside interface

/*
interface Library {
	  
	void issueBook(Book b);
	void retrieveBook(Book b);
	  class Book {
	      static int bookId = 20;
	      String bookName;
	      static int issueDate=45;
	      int returnDate;
	      
	   }
	}

public class ClassInsideInterface implements Library {
	   public void issueBook(Book b) {
	      System.out.println("Book Issued");
	      System.out.println(Library.Book.bookId+Library.Book.issueDate);
	   }
	   public void retrieveBook(Book b) {
	      System.out.println("Book Retrieved");
	   }
	   public static void main(String args[]) {
	      Library obj = new ClassInsideInterface();
	      Library.Book lb = new Library.Book();
	      obj.issueBook(lb);
	      obj.retrieveBook(lb);
	   }
	}*/
//another way of defining class inside interface

interface Library {

	void issueBook(Book b);

	void retrieveBook(Book b);

	public class Book {
		static int bookId = 20;
		String bookName;
		static int issueDate = 45;
		int returnDate;

	}
}

public class ClassInsideInterface extends Library.Book implements Library {
	public void issueBook() {
		System.out.println("Book Issued");
		System.out.println(Library.Book.bookId + Library.Book.issueDate);
	}

	public void retrieveBook() {
		System.out.println("Book Retrieved");
	}

	public static void main(String args[]) {
		Library obj = new ClassInsideInterface();
		Library.Book lb = new Library.Book();
		obj.issueBook(lb);
		obj.retrieveBook(lb);
	}
}
