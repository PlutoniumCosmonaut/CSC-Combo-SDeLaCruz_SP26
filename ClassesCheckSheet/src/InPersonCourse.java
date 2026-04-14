
public class InPersonCourse extends Course {

	private String roomnum;

	public InPersonCourse() {
		super();
		roomnum = "";

	}

	public InPersonCourse(String coursenum, int numStudents, int maxStudents, int credits, String roomnum) {
		super(coursenum, numStudents, maxStudents, credits);
		this.roomnum = roomnum;

	}

	public String getRoomnum() {
		return roomnum;
	}

	public void setRoomnum(String roomnum) {
		this.roomnum = roomnum;
	}

	@Override
	public String toString() {
		return "InPersonCourse" + "\ncoursenum: " + super.getStr() + "\nnumStudents: " + super.getNumStudents()
				+ "\nmaxStudents: " + super.getMaxStudents() + "\ncredits: " + super.getCredits() +  "\nroomnum: " + roomnum;
	}

	
	
}
