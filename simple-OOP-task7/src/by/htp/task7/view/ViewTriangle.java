package by.htp.task7.view;

import by.htp.task7.entity.Points;

public class ViewTriangle {
	
	public void viewPerimeter (double p) {
		System.out.println("�������� ������������ �����: " + p);
	}
	
	public void viewArea (double a) {
		System.out.println("������� ������������ �����: " + a);
	}
	
	public void viewMedian (Points m) {
		System.out.println("���������� ����� ����������� ������ - M("+m.getX()+"; "+m.getY()+")");
	}
	
}
