import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class myfilereader {
	File file;
	ArrayList<Course> crsList = new ArrayList<>();
	
	public myfilereader(String fileName) {
		file = new File(fileName);
		try (Scanner myReader = new Scanner(file)){
			while(myReader.hasNextLine())
			{
				
				String data = myReader.nextLine();
				String[] parts = data.split(" ");
				//System.out.println(data);
				String type = parts[0];
				String option = parts[1];				
				String crsNum = parts[2];
				int numStuds = Integer.valueOf(parts[3]);
				int maxStuds = Integer.valueOf(parts[4]);
				int creds = Integer.valueOf(parts[5]);
				Course course;
				if(type.equals("IP")) {
					course = new InPersonCourse(crsNum, numStuds, maxStuds, creds, option);
				}else if(type.equals("FR"))
				{
					 course = new InPersonCourse(crsNum, numStuds, maxStuds, creds, option);
				}else
				{
					 course = new InPersonCourse(crsNum, numStuds, maxStuds, creds, option);
				}
				crsList.add(course);
			}
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
		}
	}
	
	public ArrayList<Course> getList()
	{
		return crsList;
	}
}
