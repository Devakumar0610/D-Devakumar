package Exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWritter {

	public static void main(String[] args) throws IOException {
		File s=new File("/home/devakumar/Music/deva.txt");
	    s.createNewFile();
        FileWriter k=new FileWriter(s);
//	     
//	    k.write("DEVAKUMAR\n\t");
//	    k.write("SIVA\n\t");
//	    k.write("MANI");
//	    k.flush();
//	    k.close();
	    
	    
        BufferedWriter m=new BufferedWriter(k);
//	    m.write("Anisha");
//	    m.flush();
//	    m.close();
	    
	    PrintWriter n=new PrintWriter(m);
	    n.write("Arun is a good boysiva is bad boyDeva is very very nice boymani is very very hard work person");
	  //n.write("siva");
	    n.flush();
	    n.close();
	    
	    
	    
	    
	}

}
