package by.htp.task3.view;

import java.util.ArrayList;
import by.htp.task3.entity.Student;
import by.htp.task3.logic.GroupLogic;

public class StudentsView {
	public void printALevelStudents(ArrayList<Student> groupLogic) {
		System.out.println("������ ����������: ");
		for (int i = 0; i < groupLogic.size(); i++) {
			String surname = groupLogic.get(i).getSurname();
			int group = groupLogic.get(i).getGroup();
			System.out.println("�������: "+surname+", ������ "+group);
		}
	}
}
