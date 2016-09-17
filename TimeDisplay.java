package cse215;
import java.time.*;
import java.util.Calendar;


public class TimeDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TimeDisplay timeTest = new TimeDisplay();
		
	}
	
	public TimeDisplay() {
		
		LocalDateTime current_local_time = LocalDateTime.now();
		
		int hour = current_local_time.getHour();
		int minute = current_local_time.getMinute();
		int second = current_local_time.getSecond();
		
		System.out.println("Current local time (hour:minute:second) - "+hour+":"+minute+":"+second);
		
		Calendar gmtTime = Calendar.getInstance();
		
		long millsTime = gmtTime.getTimeInMillis();
	
		//System.out.println(millsTime);
		
		ZoneId id = ZoneId.of("GMT");
		
		LocalDateTime gmt_time_local = LocalDateTime.now(id);
		
		int hour_gmt = gmt_time_local.getHour();
		int minute_gmt = gmt_time_local.getMinute();
		int second_gmt = gmt_time_local.getSecond();
		
		System.out.println("Current GMT time (hour:minute:second) - "+hour_gmt+":"+minute_gmt+":"+second_gmt);
	}

}
