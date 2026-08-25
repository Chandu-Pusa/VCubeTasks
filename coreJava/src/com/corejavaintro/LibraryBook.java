package com.corejavaintro;

public class LibraryBook {
	
	static int count = 0;
	
	String bookId;
	String bookTitle;
	String authorName;
	int availableCopies;
	
	
	String libraryName;
	String librarianName;
	
	{
		count++;
	}
	
	void displayBookDetails() {
		System.out.println("Book Id: "+ bookId);
		System.out.println("Book Title: "+ bookTitle);
		System.out.println("Author Name: "+ authorName);
		System.out.println("Available Copies: "+ availableCopies);
		System.out.println();
	}
	
	void issueBook() {
		if(availableCopies > 0)
		availableCopies--;
		else
			System.out.println("There are no books of " +bookTitle+" available right now");
		System.out.println();
	}
	
	void displayLibraryDetails() {
		System.out.println("Library Name: "+ libraryName);
		System.out.println("Librarian Name: "+ librarianName);
		System.out.println();
	}
	
	void changeLibrarianName(String s) {
		librarianName = s;
		System.out.println("new librarian of "+libraryName+" is "+ librarianName);
		System.out.println();
	}
	
	static void totalBooks() {
		System.out.println("Total Number of Books right now are "+ count);
	}
 
	public static void main(String[] args) {
		
		LibraryBook b1 = new LibraryBook();
		
		b1.bookId = "B101";
		b1.bookTitle = "TGED";
		b1.authorName = "Water";
		b1.availableCopies = 0;
		b1.libraryName = "Lib1";
		b1.librarianName = "Librarian1";
		
		LibraryBook b2 = new LibraryBook();
		
		b2.bookId = "B102";
		b2.bookTitle = "TBATE";
		b2.authorName = "Arthur";
		b2.availableCopies = 110;
		b2.libraryName = "Lib2";
		b2.librarianName = "Librarian2";
		
		b1.displayBookDetails();
		b1.displayLibraryDetails();
		b1.issueBook();
		b1.changeLibrarianName("Sun Jin Woo");
		
		b2.displayBookDetails();
		b2.displayLibraryDetails();
		b2.issueBook();
		b2.changeLibrarianName("Sun Wukong");
		
		totalBooks();
	}

}
