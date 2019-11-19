package by.htp.task6.view;

import by.htp.task6.entity.Time;

public class ViewTime {
	
	public void viewTimeStart(Time time) {
		System.out.println("Начальное время: "+time.getHour()+" : "+time.getMinute()+" : "+time.getSecund());
	}
	
	public void viewTime(int[] newTime) {
		System.out.println("Установленное время: "+newTime[0]+" : "+newTime[1]+" : "+newTime[2]);
	}
	
}
