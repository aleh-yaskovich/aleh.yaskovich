package by.htp.task8.logic;

import java.util.ArrayList;
import java.util.Scanner;

import by.htp.task8.entity.Customer;

public class CustomerLogic {

	public ArrayList<Customer> sortBySurname(ArrayList<Customer> customers) {
		int i = 0;
		while (i < customers.size()-1) {
			if (customers.get(i).getSurname().compareTo(customers.get(i+1).getSurname()) > 0) {
				Customer tmp = customers.get(i+1);
				customers.set(i+1, customers.get(i));
				customers.set(i, tmp);
				i = 0;
			}
			else if (customers.get(i).getSurname().compareTo(customers.get(i+1).getSurname()) == 0) {
				if (customers.get(i).getName().compareTo(customers.get(i+1).getName()) > 0) {
					Customer tmp = customers.get(i+1);
					customers.set(i+1, customers.get(i));
					customers.set(i, tmp);
					i = 0;
				}
				else if (customers.get(i).getName().compareTo(customers.get(i+1).getName()) == 0) {
					if (customers.get(i).getPatronymic().compareTo(customers.get(i+1).getPatronymic()) > 0) {
						Customer tmp = customers.get(i+1);
						customers.set(i+1, customers.get(i));
						customers.set(i, tmp);
						i = 0;
					}
					else if (customers.get(i).getPatronymic().compareTo(customers.get(i+1).getPatronymic()) == 0) {
						i++;
					}
					else {
						i++;
					}
				}
				else {
					i++;
				}
			}
			else {
				i++;
			}
		}
		return customers;
	}
	
	private int minNumberCard(ArrayList<Customer> customers) {
		int minNumberCard = customers.get(0).getNumberCard();
		for (int i = 0; i < customers.size(); i++) {
			if (minNumberCard > customers.get(i).getNumberCard()) {
				minNumberCard = customers.get(i).getNumberCard();
			}
		}
		return minNumberCard;
	}
	
	private int maxNumberCard(ArrayList<Customer> customers) {
		int maxNumberCard = customers.get(0).getNumberCard();
		for (int i = 0; i < customers.size(); i++) {
			if (maxNumberCard < customers.get(i).getNumberCard()) {
				maxNumberCard = customers.get(i).getNumberCard();
			}
		}
		return maxNumberCard;
	}
	
	public int enterMinNumberCard(ArrayList<Customer> customers) {
		int min = minNumberCard(customers);
		int max = maxNumberCard(customers);
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите  номер кредитной карточки в диапазоне от "+min+" до "+max+": ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите  номер кредитной карточки в диапазоне от "+min+" до "+max+": ");
        }
        int minNumberCard = sc.nextInt();
        while (minNumberCard < min || minNumberCard > max) {
        	System.out.print("Введите  номер кредитной карточки в диапазоне от "+min+" до "+max+": ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите  номер кредитной карточки в диапазоне от "+min+" до "+max+": ");
            }
            minNumberCard = sc.nextInt();
        }
        return minNumberCard;
	}
	public int enterMaxNumberCard(ArrayList<Customer> customers, int minNumberCard) {
		int min = minNumberCard;
		int max = maxNumberCard(customers);
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите  номер кредитной карточки в диапазоне от "+min+" до "+max+": ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите  номер кредитной карточки в диапазоне от "+min+" до "+max+": ");
        }
        int maxNumberCard = sc.nextInt();
        while (maxNumberCard < min || maxNumberCard > max) {
        	System.out.print("Введите  номер кредитной карточки в диапазоне от "+min+" до "+max+": ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите  номер кредитной карточки в диапазоне от "+min+" до "+max+": ");
            }
            maxNumberCard = sc.nextInt();
        }
        return maxNumberCard;
	}
	
	public ArrayList<Customer> customersNumberCard(ArrayList<Customer> customers, int minNumberCard, int maxNumberCard) {
		ArrayList<Customer> customersCard = new ArrayList<Customer>();
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getNumberCard() >= minNumberCard && customers.get(i).getNumberCard() <= maxNumberCard) {
				customersCard.add(customers.get(i));
			}
		}
		return customersCard;
	}
	
}
