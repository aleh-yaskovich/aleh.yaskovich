package by.htp.task10.logic;

import java.util.ArrayList;
import java.util.Scanner;
import by.htp.task10.entity.Airline;

public class AirlineLogic {

	public String enterDestination() {
		Scanner sc = new Scanner(System.in);
        System.out.print("¬ведите пункт назначени€: ");
        String destination = sc.next();
        return destination;
	}
	
	public ArrayList<Airline> searchDestination(ArrayList<Airline> flight, String destination) {
		ArrayList<Airline> searchDestination = new ArrayList<Airline>();
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getDestination().equals(destination)) {
				searchDestination.add(flight.get(i));
			}
		}
		return searchDestination;
	}
	
	public String enterWeekday() {
		Scanner sc = new Scanner(System.in);
        System.out.print("¬ведите день вылета: ");
        String weekday = sc.next();
        return weekday;
	}
	
	public ArrayList<Airline> searchWeekday(ArrayList<Airline> flight, String weekday) {
		ArrayList<Airline> searchWeekday = new ArrayList<Airline>();
		for (int i = 0; i < flight.size(); i++) {
			boolean res = false;
			char[] ch = flight.get(i).getWeekday().toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == ',') {
					res = true;
				}
			}
			if (res) {
				String[] strArr = flight.get(i).getWeekday().split(",");
				for (int k = 0; k < strArr.length; k++) {
					if (strArr[k].equals(weekday)) {
						searchWeekday.add(flight.get(i));
					}
				}
			}
			if (flight.get(i).getWeekday().equals(weekday)) {
				searchWeekday.add(flight.get(i));
			}
		}
		return searchWeekday;
	}
	
	public int enterHour() {
		Scanner sc = new Scanner(System.in);
        System.out.print("¬ведите число в диапазоне от 0 до 23: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("¬ведите число в диапазоне от 0 до 23: ");
        }
        int hour = sc.nextInt();
        while (hour < 0 || hour > 23) {
        	System.out.print("¬ведите число в диапазоне от 0 до 23: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("¬ведите число в диапазоне от 0 до 23: ");
            }
            hour = sc.nextInt();
        }
        return hour;
	}
	
	public int enterMinute() {
		Scanner sc = new Scanner(System.in);
        System.out.print("\n¬ведите число в диапазоне от 0 до 59: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("¬ведите число в диапазоне от 0 до 59: ");
        }
        int minute = sc.nextInt();
        while (minute < 0 || minute > 59) {
        	System.out.print("¬ведите число в диапазоне от 0 до 59: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("¬ведите число в диапазоне от 0 до 59: ");
            }
            minute = sc.nextInt();
        }
        return minute;
	}
	
	public ArrayList<Airline> searchWeekdayWithTime(ArrayList<Airline> arr, int hour, int minute) {
		ArrayList<Airline> searchWeekdayT = new ArrayList<Airline>();
		
		for (int i = 0; i < arr.size(); i++) {
			if (hour < arr.get(i).getHour()) {
				searchWeekdayT.add(arr.get(i));
			} else if (hour == arr.get(i).getHour()) {
				if (minute < arr.get(i).getMinute()) {
					searchWeekdayT.add(arr.get(i));
				}
			}
		}
		return searchWeekdayT;
	}

}
