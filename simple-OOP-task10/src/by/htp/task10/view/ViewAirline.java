package by.htp.task10.view;

import java.util.ArrayList;
import by.htp.task10.entity.Airline;

public class ViewAirline {
	
	public void viewAirline(ArrayList<Airline> flight) {
		for (int i = 0; i < flight.size(); i++) {
			System.out.println("\nНомер рейса: " + flight.get(i).getFlightNumber());
			System.out.println("Пункт назначения: " + flight.get(i).getDestination());
			System.out.println("Тип самолета: " + flight.get(i).getAirplaneType());
			System.out.println("Время вылета: "+ flight.get(i).getHour() +"ч. "+ flight.get(i).getMinute() +"мин.");
			System.out.println("День вылета: " + flight.get(i).getWeekday());
		}
	}
	
	public void viewAirlineSearch (ArrayList<Airline> arr) {
		if (arr.size() > 0) {
			for (int i = 0; i < arr.size(); i++) {
				System.out.println("\nНомер рейса: " + arr.get(i).getFlightNumber());
				System.out.println("Пункт назначения: " + arr.get(i).getDestination());
				System.out.println("Тип самолета: " + arr.get(i).getAirplaneType());
				System.out.println("Время вылета: "+ arr.get(i).getHour() +"ч. "+ arr.get(i).getMinute() +"мин.");
				System.out.println("День вылета: " + arr.get(i).getWeekday());
			}
		} else {
			System.out.println("Рейсов нет!");
		}
	}
	
	
	
}
