package by.htp.task9.view;

import java.util.ArrayList;
import by.htp.task9.entity.Book;

public class ViewBooks {
	
	public void viewBooks (ArrayList<Book> books) {
		for (int i = 0; i < books.size(); i++) {
			System.out.println("Книга ID: "+books.get(i).getId());
			System.out.println("Автор: "+books.get(i).getAuthor());
			System.out.println("Издательство: "+books.get(i).getPublishing()+", дата издания: "+books.get(i).getPublicationDate());
			System.out.println("Количество страниц: "+books.get(i).getNumberOfPages());
			System.out.println("Цена: "+books.get(i).getPrice());
			System.out.println("Переплет: "+books.get(i).getBindingType()+"\n");
		}
	}
	
	public void viewBooksSearch (ArrayList<Book> arr) {
		if (arr.size() > 0) {
			for (int i = 0; i < arr.size(); i++) {
				System.out.println("Книга ID: "+arr.get(i).getId());
				System.out.println("Автор: "+arr.get(i).getAuthor());
				System.out.println("Издательство: "+arr.get(i).getPublishing()+", дата издания: "+arr.get(i).getPublicationDate());
				System.out.println("Количество страниц: "+arr.get(i).getNumberOfPages());
				System.out.println("Цена: "+arr.get(i).getPrice());
				System.out.println("Переплет: "+arr.get(i).getBindingType()+"\n");
			}
		} else {
			System.out.println("Книг нет!");
		}
	}
	
}
