package by.htp.task4.view;

import java.util.Scanner;

public class EnterNumber {
	
	public int enterByNumber() {
		Scanner sc = new Scanner(System.in);
        System.out.print("������� ����� ������: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("������� ����� ������: ");
        }
        int numberTrain = sc.nextInt();
        return numberTrain;
	}
	
}
