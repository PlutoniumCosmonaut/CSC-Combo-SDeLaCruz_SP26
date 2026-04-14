
public class RealTimeRemoteCourse extends OnlineCourse {

	private String zoom;

	public RealTimeRemoteCourse() {
		super();
		zoom = "";
		// TODO Auto-generated constructor stub
	}

	public RealTimeRemoteCourse(String coursenum, int numStudents, int maxStudents, int credits, String zoom) {
		super(coursenum, numStudents, maxStudents, credits);
		this.zoom = zoom;
		// TODO Auto-generated constructor stub
	}

	public String getZoom() {
		return zoom;
	}

	public void setZoom(String zoom) {
		this.zoom = zoom;
	}

	@Override
	public String toString() {
		return "RealTimeRemoteCourse" + "\ncoursenum: " + super.getStr() + "\nnumStudents: " + super.getNumStudents()
				+ "\nmaxStudents: " + super.getMaxStudents() + "\ncredits: " + super.getCredits() + "\nzoom: " + zoom;
	}
	
	
	

}
