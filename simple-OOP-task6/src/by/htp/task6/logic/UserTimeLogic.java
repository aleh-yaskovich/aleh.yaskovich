package by.htp.task6.logic;

import java.util.Scanner;

public class UserTimeLogic {
	
	public int[] enterNum() {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("������� ���������� �����: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("������� ���������� �����:  ");
        }
        int userHour = sc.nextInt();
        while (userHour < 0) {
        	System.out.print("������� ���������� �����: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("������� ���������� �����: ");
            }
            userHour = sc.nextInt();
        }
        
        System.out.print("������� ���������� �����: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("������� ���������� �����:  ");
        }
        int userMinute = sc.nextInt();
        while (userMinute < 0) {
        	System.out.print("������� ���������� �����: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("������� ���������� �����: ");
            }
            userMinute = sc.nextInt();
        }
        
        System.out.print("������� ���������� ������: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("������� ���������� ������:  ");
        }
        int userSecund = sc.nextInt();
        while (userSecund < 0) {
        	System.out.print("������� ���������� ������: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("������� ���������� ������: ");
            }
            userSecund = sc.nextInt();
        }
        int[] userTime = {userHour, userMinute, userSecund};        
        return userTime;
	}
	
	
}
