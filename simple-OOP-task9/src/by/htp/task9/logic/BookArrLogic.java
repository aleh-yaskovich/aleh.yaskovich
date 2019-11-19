package by.htp.task9.logic;


import java.util.ArrayList;
import java.util.Scanner;
import by.htp.task9.entity.Book;

public class BookArrLogic {
	
	public String enterAuthor() {
		Scanner sc = new Scanner(System.in);
        System.out.print("¬ведите им€ автора книги: ");
        String author = sc.next();
        return author;
	}
	
	public ArrayList<Book> searchAuthor(ArrayList<Book> books, String author) {
		ArrayList<Book> searchAuthor = new ArrayList<Book>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getAuthor().equals(author)) {
				searchAuthor.add(books.get(i));
			}
		}
		return searchAuthor;
	}
	
	public String enterPublishing() {
		Scanner sc = new Scanner(System.in);
        System.out.print("¬ведите название издательства: ");
        String publishing = sc.next();
        return publishing;
	}
	
	public ArrayList<Book> searchPublishing(ArrayList<Book> books, String publishing) {
		ArrayList<Book> searchPublishing = new ArrayList<Book>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getPublishing().equals(publishing)) {
				searchPublishing.add(books.get(i));
			}
		}
		return searchPublishing;
	}
	
	private int minDate(ArrayList<Book> books) {
		int minDate = books.get(0).getPublicationDate();
		for (int i = 0; i < books.size(); i++) {
			if (minDate > books.get(i).getPublicationDate()) {
				minDate = books.get(i).getPublicationDate();
			}
		}
		return minDate;
	}
	
	public int enterPublicationDate(ArrayList<Book> books) {
		int min = minDate(books);
		Scanner sc = new Scanner(System.in);
        System.out.print("¬ведите год издани€ от "+min+": ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("¬ведите год издани€ от "+min+": ");
        }
        int publicationDate = sc.nextInt();
        while (publicationDate < min) {
        	System.out.print("¬ведите год издани€ от "+min+": ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("¬ведите год издани€ от "+min+": ");
            }
            publicationDate = sc.nextInt();
        }
        return publicationDate;
	}
	
	public ArrayList<Book> searchPublicationDate(ArrayList<Book> books, int publicationDate) {
		ArrayList<Book> searchPublicationDate = new ArrayList<Book>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getPublicationDate() >= publicationDate) {
				searchPublicationDate.add(books.get(i));
			}
		}
		return searchPublicationDate;
	}
	
}
