package Exception;

import java.io.File;
import java.io.IOException;

public class filedemo {

	public static void main(String[] args) {
		
		File file_obj= new File("/home/devakumar/Music/Deva/paal/siva/Arun/mani");
        
//		try {
			//System.out.println("new file "+file_obj.createNewFile());
			//file_obj.delete();
		    //file_obj.exists();
			 // file_obj.isHidden();
			//System.out.println(file_obj.length()); 
		    //System.out.println(file_obj.getPath()); 
		    //System.out.println(file_obj.getName());
		     //System.out.println(file_obj.isDirectory());
		      //System.out.println(file_obj.isFile());
		
		file_obj.mkdirs();
		}
//		catch (IOException e)
//		{
//			
//			e.printStackTrace();
//		}
//	}

}
