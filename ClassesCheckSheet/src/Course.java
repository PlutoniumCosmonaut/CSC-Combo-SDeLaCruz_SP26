
public class Course {

	String coursenum = "CSC119";
	int numStudents = 0;
	int maxStudents = 0;
	int credits = 0;

	public Course() {
		super();
		this.coursenum = "";
		this.numStudents = 0;
		this.maxStudents = 0;
		this.credits = 0;
	}

	public Course(String coursenum, int numStudents, int maxStudents, int credits) {
		super();
		this.coursenum = coursenum;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;

	}

	public String getStr() {
		return coursenum;
	}

	public void setStr(String str) {
		this.coursenum = str;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Course [str=" + coursenum + "\nnumStudents=" + numStudents + "\nmaxStudents=" + maxStudents + "\ncredits="
				+ credits + "]";
	}

}
