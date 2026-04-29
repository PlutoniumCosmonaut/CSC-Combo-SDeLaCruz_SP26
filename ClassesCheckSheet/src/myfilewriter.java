import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class myfilewriter {
	private File file;
	private String fileName;
	
	public myfilewriter(String fileName) {
		try {
			file = new File(fileName);
			if(file.createNewFile())
			{
				System.out.println("File Created " + file.getName());
			}else
			{
				System.out.println("File already exists.");
			}
		}catch(IOException e)
		{
			System.out.println("An error occured");
			e.getStackTrace();
		}
	}
	public void writeToFile(File file, String data)
	{
		try(FileWriter myWriter = new FileWriter(file))
		{
			myWriter.write(data);
			System.out.println("Write successful");
		}catch(IOException e)
		{
			System.out.println("Write failed");
			e.printStackTrace();
		}
				
	}
	public void appendToFile(File file, String data)
	{
		try(FileWriter myWriter = new FileWriter(file, true))
		{
			myWriter.write(data);
			System.out.println("Write successful");
		}catch(IOException e)
		{
			System.out.println("Write failed");
			e.printStackTrace();
		}
				
	}
	
	public File getFile() {
		return file;
	}

}
