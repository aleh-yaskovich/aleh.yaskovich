package by.htp.task4.view;

import java.util.ArrayList;

import by.htp.task4.entity.Train;

public class ViewByNumber {
	
	public void viewByNumber(ArrayList<Train> trains, int number) {
		boolean res = false;
		int i;
		for (i = 0; i < trains.size(); i++) {
			if (number == trains.get(i).getNumberTrain()) {
				res = true;
				break;
			}
		}
		if (res) {
			System.out.println("����� ������: " + trains.get(i).getNumberTrain());
			System.out.println("�������� �������: " + trains.get(i).getDestinationStation());
			System.out.println("����� �����������: " + trains.get(i).getDepartureHours()+"�. "+trains.get(i).getDepartureMinutes()+"���.\n");
			
		} else {
			System.out.println("����� � ����� ������� �� ������!\n");
		}
	}
	
}
