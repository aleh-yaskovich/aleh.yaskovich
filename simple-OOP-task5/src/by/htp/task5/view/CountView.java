package by.htp.task5.view;

import java.util.Scanner;

public class CountView {
	
	public void ViewCount(int count) {
		System.out.println("�������� �������� �����: " + count);
	}
	
	public String EnterPlusMinus () {
		Scanner sc = new Scanner(System.in);
	    System.out.print("���� �� ������ ��������� ��� ��������� ������� �� 1, ������� \"+\" ��� \"-\": ");
	    while(!sc.hasNext("[+-]")) {
	        sc.next();
	        System.out.print("������� \"+\" ��� \"-\": ");
	    }
	    String plusMinus = sc.next();
	    return plusMinus;
	}
	
	public void NegativeResult(int countChange) {
		if (countChange < 0) {
			System.out.println("�������� �������� �� ����� ���� ������ 0");
		} else if (countChange > 9) {
			System.out.println("�������� �������� �� ����� ���� ������ 9");
		}
	}
	
}
