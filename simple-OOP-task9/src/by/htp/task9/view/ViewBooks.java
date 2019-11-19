package by.htp.task9.view;

import java.util.ArrayList;
import by.htp.task9.entity.Book;

public class ViewBooks {
	
	public void viewBooks (ArrayList<Book> books) {
		for (int i = 0; i < books.size(); i++) {
			System.out.println("����� ID: "+books.get(i).getId());
			System.out.println("�����: "+books.get(i).getAuthor());
			System.out.println("������������: "+books.get(i).getPublishing()+", ���� �������: "+books.get(i).getPublicationDate());
			System.out.println("���������� �������: "+books.get(i).getNumberOfPages());
			System.out.println("����: "+books.get(i).getPrice());
			System.out.println("��������: "+books.get(i).getBindingType()+"\n");
		}
	}
	
	public void viewBooksSearch (ArrayList<Book> arr) {
		if (arr.size() > 0) {
			for (int i = 0; i < arr.size(); i++) {
				System.out.println("����� ID: "+arr.get(i).getId());
				System.out.println("�����: "+arr.get(i).getAuthor());
				System.out.println("������������: "+arr.get(i).getPublishing()+", ���� �������: "+arr.get(i).getPublicationDate());
				System.out.println("���������� �������: "+arr.get(i).getNumberOfPages());
				System.out.println("����: "+arr.get(i).getPrice());
				System.out.println("��������: "+arr.get(i).getBindingType()+"\n");
			}
		} else {
			System.out.println("���� ���!");
		}
	}
	
}
