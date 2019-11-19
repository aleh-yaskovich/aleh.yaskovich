package by.htp.task3.logic;

import java.util.ArrayList;
import by.htp.task3.entity.Student;
import by.htp.task3.entity.Group;
import by.htp.task3.logic.StudentLogic;

public class GroupLogic {
	
	private ArrayList<Student> honours = new ArrayList<Student>();
	
	public GroupLogic() {
		this.honours = new ArrayList<Student>();
	}
	
	public ArrayList<Student> isALevelStudent(Group group) {
		StudentLogic studentLogic = new StudentLogic();
		ArrayList<Student> honours = new ArrayList<Student>();
		for (int i = 0; i < group.getStudents().size(); i++) {
			if (studentLogic.isALevelStudent(group.getStudents().get(i))) {
				honours.add(group.getStudents().get(i));
			}
		}
		return honours;
	}

	public ArrayList<Student> getHonours() {
		return honours;
	}

	public void setHonours(ArrayList<Student> honours) {
		this.honours = honours;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((honours == null) ? 0 : honours.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroupLogic other = (GroupLogic) obj;
		if (honours == null) {
			if (other.honours != null)
				return false;
		} else if (!honours.equals(other.honours))
			return false;
		return true;
	}

	
	
	
	
	
}


