package Exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) throws IOException {
		File s=new File("/home/devakumar/Music/deva.txt");
	   // s.createNewFile();
	    FileReader reader = new FileReader(s); 
	    BufferedReader bReader = new BufferedReader(reader);
	    String output = bReader.readLine(); 
	    while(output!=null)
	    {
	     System.out.println();
	     output = bReader.readLine();
	    }
	    bReader.close();
//	    int r = reader.read();        
//	   // System.out.println(r);
//	    int wordCount = 1;
//	    int sentenceCount = 0; 
//	    while(r!=-1) {
//	    System.out.print((char)r);
//	    if((char)r == ' ')
//	     wordCount++; 
//	    if((char)r =='.')
//	     sentenceCount++;
//	     r = reader.read();
//	   
//	    }
//	    System.out.println("Word Count is "+ wordCount);
//	    System.out.println("Sentence Count is "+ sentenceCount);


	}

}
