
public class RealTimeRemoteCourse extends OnlineCourse {

	String zoom;

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
		return "RealTimeRemoteCourse" + "\ncoursenum: " + coursenum + "\nnumStudents: " + numStudents
				+ "\nmaxStudents: " + maxStudents + "\ncredits: " + credits + "\nzoom: " + zoom;
	}
	
	
	

}
