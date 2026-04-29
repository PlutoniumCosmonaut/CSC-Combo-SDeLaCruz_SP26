import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class CSclasses {
	
	public static myfilewriter fw = new myfilewriter("courses.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		myfilereader reader = new myfilereader("courses.txt");
		
		ArrayList<Course> courseList = new ArrayList<>();

		Course course;
		String another = "yes";
		
		File file = fw.getFile();
		
		while(another.charAt(0) == 'y')
		{
			System.out.println("What type of course is it? 1 = In-Person, 2 = RTR, 3 = Full online. T ype 4 to quit out");
			int type = input.nextInt();
			if(type==4)break;
			System.out.println("what is the course number?");
			String coursenum = input.next();
			System.out.println("How many students are in the class");
			int numStudents = input.nextInt();
			System.out.println("What is the maximum number of students");
			int maxStudents = input.nextInt();
			System.out.println("How many credits is the class worth?");
			int credits = input.nextInt();
			if (type == 1) {
				System.out.println("What is the room number");
				String roomnum = input.next();
				course = new InPersonCourse(coursenum, numStudents, maxStudents, credits, roomnum);
			} else if (type == 2) {
				System.out.println("What is the zoom info");
				String zoom = input.next();
				course = new RealTimeRemoteCourse(coursenum, numStudents, maxStudents, credits, zoom);
			} else {
				System.out.println("What is the email");
				String email = input.next();
				course = new FullRemoteCourse(coursenum, numStudents, maxStudents, credits, email);
			}
			courseList.add(course);
			addToFile(file, course);
			System.out.println("Do you need to enter another?");
			another = input.next();
			another = another.toLowerCase();
		}
	
	for(Course course1: courseList)
	{
		print(course1);
	}
}
	private static void addToFile(File file, Course course) 
	{
		if(course instanceof InPersonCourse)
		{
			fw.appendToFile(file, "IP ");
			InPersonCourse ipcourse = (InPersonCourse) course;
			fw.appendToFile(file, ipcourse.getRoomnum() + " ");
		}else if(course instanceof FullRemoteCourse)
		{
			fw.appendToFile(file, "FR ");
			FullRemoteCourse ipcourse = (FullRemoteCourse) course;
			fw.appendToFile(file, ipcourse.getEmail() + " ");
		}else if(course instanceof RealTimeRemoteCourse)
		{
			fw.appendToFile(file, "RTR ");
			RealTimeRemoteCourse ipcourse = (RealTimeRemoteCourse) course;
			fw.appendToFile(file, ipcourse.getZoom() + " ");
		}
		
		fw.appendToFile(file, course.getStr() + " ");
		fw.appendToFile(file, course.getNumStudents() + " ");
		fw.appendToFile(file, course.getMaxStudents() + " ");
		fw.appendToFile(file, course.getCredits() + "\n");
	}
	
	
	public static void print(Course course)
	{
		 System.out.println(course);
	}
	public static void getPrinter(Course course) {
		System.out.println("Course:" + course.getStr());
		System.out.println("Number of students:" + course.getNumStudents());
		System.out.println("Max students:" + course.getMaxStudents());
		System.out.println("Credits:" + course.getCredits());
		if(course instanceof InPersonCourse){
			InPersonCourse IPcourse = (InPersonCourse)course;
			System.out.println("Room:" + IPcourse.getRoomnum());
		}
		else if(course instanceof FullRemoteCourse){
			FullRemoteCourse FMcourse = (FullRemoteCourse)course;
			System.out.println("Email:" + FMcourse.getEmail());
		}
		else if(course instanceof RealTimeRemoteCourse){
			RealTimeRemoteCourse RTRcourse = (RealTimeRemoteCourse)course;
			System.out.println("Zoom:" + RTRcourse.getZoom());
		}
	}
}
