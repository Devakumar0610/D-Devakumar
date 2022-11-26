package Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {

	public static void main(String[] args) throws IOException {
	 File file_obj =new File("/home/devakumar/Music/Deva_resume.txt");
	 FileWriter writer = new FileWriter(file_obj);
     
	 
	 
	 writer.write("Mobile: 9360114012");
	 writer.write("\n");
	 writer.write("git: Deva");
	 writer.write(6);
	 writer.close();

}
}
