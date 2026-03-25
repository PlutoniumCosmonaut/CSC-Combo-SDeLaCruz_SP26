package time;

public class Time {
//instance variables
	private int hour;
	private int minute;
	private double seconds;

	// default
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.seconds = 0.0;
	}

	// value constructor
	public Time(int hour, int minute, double seconds) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}

	public static Time add(Time t1, Time t2) {
		Time sum = new Time();
		sum.hour = t1.hour + t2.hour;
		sum.minute = t1.minute + t2.minute;
		sum.seconds = t1.seconds + t2.seconds;

		if (sum.seconds > 60.0) {
			sum.minute++;
			sum.seconds -= 60.0;
		}
		if (sum.minute > 60) {
			sum.minute -= 60;
			sum.hour++;
		}
		if (sum.hour > 24) {
			sum.hour %= 24;
		}
		return sum;
	}

	public boolean equals(Time that) {
		final double DELTA = 0.001;
		if (this.hour != that.hour)
			return false;
		if (this.minute != that.minute)
			return false;
		if (Math.abs(this.seconds - that.seconds) > DELTA)
			return false;
		return true;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public double getSeconds() {
		return seconds;
	}

	public void setSeconds(double seconds) {
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ";" + seconds;
	}

}
