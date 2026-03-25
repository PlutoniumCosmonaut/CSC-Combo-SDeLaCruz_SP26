package time;

public class TimeDriver {

	public static void main(String[] args) {
		Time time = new Time(18, 50, 0.0);
		Time time2 = new Time(2, 16, 0.0);
		
		Time time3 = Time.add(time, time2);
		System.out.println(time3);
		
		System.out.println(time.equals(time2));
		
		System.out.println(time);
		
		System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSeconds());
	}

}
