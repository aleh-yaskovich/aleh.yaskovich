package by.htp.task10.view;

import java.util.ArrayList;
import by.htp.task10.entity.Airline;

public class ViewAirline {
	
	public void viewAirline(ArrayList<Airline> flight) {
		for (int i = 0; i < flight.size(); i++) {
			System.out.println("\n����� �����: " + flight.get(i).getFlightNumber());
			System.out.println("����� ����������: " + flight.get(i).getDestination());
			System.out.println("��� ��������: " + flight.get(i).getAirplaneType());
			System.out.println("����� ������: "+ flight.get(i).getHour() +"�. "+ flight.get(i).getMinute() +"���.");
			System.out.println("���� ������: " + flight.get(i).getWeekday());
		}
	}
	
	public void viewAirlineSearch (ArrayList<Airline> arr) {
		if (arr.size() > 0) {
			for (int i = 0; i < arr.size(); i++) {
				System.out.println("\n����� �����: " + arr.get(i).getFlightNumber());
				System.out.println("����� ����������: " + arr.get(i).getDestination());
				System.out.println("��� ��������: " + arr.get(i).getAirplaneType());
				System.out.println("����� ������: "+ arr.get(i).getHour() +"�. "+ arr.get(i).getMinute() +"���.");
				System.out.println("���� ������: " + arr.get(i).getWeekday());
			}
		} else {
			System.out.println("������ ���!");
		}
	}
	
	
	
}
