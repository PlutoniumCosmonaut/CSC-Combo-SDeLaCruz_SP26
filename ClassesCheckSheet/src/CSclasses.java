
public class CSclasses {

	public static void main(String[] args) {
		Course inPer = new InPersonCourse("CSC1060", 7, 64, 4, "BP119");
		Course rmt = new FullRemoteCourse("CSC1060", 7, 26, 4, "myemail.college.edu");
		Course rtr = new RealTimeRemoteCourse("CSC1060", 7, 26, 4, "Zoom Link");
		System.out.println(inPer);
		System.out.println();
		System.out.println(rmt);
		System.out.println();
		System.out.println(rtr);
	}

}
