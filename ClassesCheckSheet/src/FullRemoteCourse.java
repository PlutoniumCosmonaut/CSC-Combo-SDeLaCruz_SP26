
public class FullRemoteCourse extends OnlineCourse {

	private String email;

	public FullRemoteCourse() {
		super();
		email = "";
		// TODO Auto-generated constructor stub
	}

	public FullRemoteCourse(String coursenum, int numStudents, int maxStudents, int credits, String email) {
		super(coursenum, numStudents, maxStudents, credits);
		this.email = email;
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "FullRemoteCourse" + "\ncoursenum: " + super.getStr() + "\nnumStudents: " + super.getNumStudents()
				+ "\nmaxStudents: " + super.getMaxStudents() + "\ncredits: " + super.getCredits() + "\nemail: " + email;
	}
	
	

}
