package by.htp.task8.main;

import java.util.ArrayList;

import by.htp.task8.entity.Customer;
import by.htp.task8.logic.CustomerLogic;
import by.htp.task8.view.ViewCustomers;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Иван", "Иванович", "Иванов", "Минск", 1001, 1001);
		Customer customer2 = new Customer(2, "Петр", "Петрович", "Петров", "Брест", 1002, 1002);
		Customer customer3 = new Customer(4, "Сидор", "Сидорович", "Сидоров", "Гомель", 1003, 1003);
		Customer customer4 = new Customer(5, "Иван", "Петрович", "Сидоров", "Гродно", 1004, 1004);
		Customer customer5 = new Customer(3, "Лев", "Николаевич", "Толстой", "Москва", 1005, 1005);
		Customer customer6 = new Customer(6, "Александр", "Сергеевич", "Пушкин", "Москва", 1006, 1006);
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers.add(customer6);
		
		ViewCustomers view = new ViewCustomers();
		// view.viewCustomers(customers);
		
		CustomerLogic logic = new CustomerLogic();
		customers = logic.sortBySurname(customers);
		// view.viewCustomers(customers);
		
		// Список покупателей с №№ карточек в заданном диапазоне
		int minNumberCard = logic.enterMinNumberCard(customers);
		int maxNumberCard = logic.enterMaxNumberCard(customers, minNumberCard);
		ArrayList<Customer> customersCard = logic.customersNumberCard(customers, minNumberCard, maxNumberCard);
		view.viewCustomers(customersCard);

	}

}
