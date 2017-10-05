import java.util.Calendar;
public class Time {

	private int hour, minute, second;
	
	public Time() {
		Calendar cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
	}
	
	public Time(long elapse) {
		long total = elapse / 1000;
		second = (int) total % 60;
		total /= 60;
		minute = (int) total % 60;
		total /= 60;
		hour = (int) total % 24;
	}
	
	public Time(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
}
