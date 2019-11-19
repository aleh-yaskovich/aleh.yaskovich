package by.htp.task6.logic;

import by.htp.task6.entity.Time;

public class TimeLogic {
	
	public int[] NewTime (int[] userTime, Time time) {
		
		int toMinute = (time.getSecund() + userTime[2]) / 60;
		int secund = (time.getSecund() + userTime[2]) % 60;
		int toHour = (time.getMinute() + userTime[1] + toMinute) / 60;
		int minute = (time.getMinute() + userTime[1] + toMinute) % 60;
		int hour = time.getHour() + userTime[0] + toHour;
		
		int[] newTime = {hour, minute, secund};
		
		return newTime;
	}
	
}
