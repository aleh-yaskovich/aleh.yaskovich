package by.htp.task8.view;

import java.util.ArrayList;
import by.htp.task8.entity.Customer;

public class ViewCustomers {

	public void viewCustomers (ArrayList<Customer> customers) {
		for (int i = 0; i < customers.size(); i++) {
			System.out.println("���������� ID"+customers.get(i).getId()+": ");
			System.out.println(customers.get(i).getSurname()+" "+customers.get(i).getName()+" "+customers.get(i).getPatronymic());
			System.out.println("�����: "+customers.get(i).getAddress());
			System.out.println("H���� ��������� ��������: "+customers.get(i).getNumberCard());
			System.out.println("H���� ����������� �����: "+customers.get(i).getNumberAccount()+"\n");
		}
		
	}
	
}
